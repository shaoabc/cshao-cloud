package cn.cshao.user.service.agent;

import cn.cshao.common.dao.slldb.SllAgHpRelMapper;
import cn.cshao.common.dao.slldb.SllAgentMapper;
import cn.cshao.common.model.slldb.SllAgHpRel;
import cn.cshao.common.model.slldb.SllAgHpRelExample;
import cn.cshao.common.model.slldb.SllAgent;
import cn.cshao.common.model.slldb.SllAgentExample;
import cn.cshao.user.dto.AgentDTO;
import cn.cshao.user.utils.cache.AppCacheUtils;
import cn.cshao.user.utils.cache.base.AppCache;
import cn.cshao.user.vo.agent.AgentInfoVO;
import cn.cshao.user.vo.data.HospIdMapVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cs.cshao.common.utils.map.ModelMapUtils;
import cs.cshao.common.utils.string.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-18 4:50 下午
 */
@Service
@Slf4j
public class AgentApplyService {

    @Resource
    private SllAgentMapper sllAgentMapper;

    @Resource
    private SllAgHpRelMapper sllAgHpRelMapper;

    /**
     * 分页获取志愿者信息
     * @param dto
     * @return
     */
    public PageInfo<AgentInfoVO> queryAgentPageList(AgentDTO dto) {
        SllAgentExample agentExample =new SllAgentExample();
        agentExample.setOrderByClause("ag_id");
        SllAgentExample.Criteria criteria =agentExample.createCriteria();
        if(StringUtils.isNotBlank(dto.getAgNm())){
            criteria.andAgNmLike("%"+dto.getAgNm().trim()+"%");
        }
        if(null !=dto.getAgId()){
            criteria.andAgIdEqualTo(dto.getAgId());
        }
        PageHelper.startPage(dto.getPageNum(),dto.getPageSize());
        List<SllAgent> agentList =sllAgentMapper.selectByExample(agentExample);
        if(CollectionUtils.isNotEmpty(agentList)){
            List<AgentInfoVO> agentInfoVOList = ModelMapUtils.mapList(agentList,AgentInfoVO.class);
            PageInfo pageInfo =new PageInfo(agentInfoVOList);
            pageInfo.setList(agentInfoVOList);
            return pageInfo ;
        }

        return new PageInfo<>(new ArrayList<>());
    }

    /**
     * 测试缓存
     * @param dto
     * @return
     */
    public PageInfo<AgentInfoVO> queryAgHpRelList(AgentDTO dto) {
        SllAgHpRelExample agHpRelExample =new SllAgHpRelExample();
        agHpRelExample.setOrderByClause("id");
        SllAgHpRelExample.Criteria criteria =agHpRelExample.createCriteria();

        List<Long> agIds =null;
        if(StringUtils.isNotBlank(dto.getAgNm())){
            SllAgentExample agentExample =new SllAgentExample();
            agentExample.setOrderByClause("ag_id");
            SllAgentExample.Criteria criteria1 =agentExample.createCriteria();
            if(StringUtils.isNotBlank(dto.getAgNm())){
                criteria1.andAgNmLike("%"+dto.getAgNm().trim()+"%");
            }
            if(null !=dto.getAgId()){
                criteria1.andAgIdEqualTo(dto.getAgId());
            }
            List<SllAgent> agentList =sllAgentMapper.selectByExample(agentExample);
            if(CollectionUtils.isNotEmpty(agentList)){
                agIds = agentList.stream().map(SllAgent::getAgId).distinct().collect(Collectors.toList()); ;
            }
        }
        if(CollectionUtils.isNotEmpty(agIds)){
            criteria.andAgIdIn(agIds);
        }

        List<SllAgHpRel> agHpRelLis = sllAgHpRelMapper.selectByExample(agHpRelExample);
        if(CollectionUtils.isNotEmpty(agHpRelLis)){
            agHpRelLis.forEach(agHp->{
                Map<String, HospIdMapVO> hpMap = AppCacheUtils.getCache(AppCache.HOSPITAL);
                if(null!=hpMap && null!=agHp.getHpId() &&
                       null!=hpMap.get(agHp.getHpId().toString())){
                    //获取医院详细信息
                    HospIdMapVO hospInfo =hpMap.get(agHp.getHpId().toString());
                    hospInfo.getHospNm();//医院名称
                }

            });
        }


        return new PageInfo<>(new ArrayList<>());
    }
}
