package cn.cshao.user.service.agent;

import cn.cshao.common.dao.slldb.SllAgentMapper;
import cn.cshao.common.model.slldb.SllAgent;
import cn.cshao.common.model.slldb.SllAgentExample;
import cn.cshao.user.dto.AgentDTO;
import cn.cshao.user.vo.agent.AgentInfoVO;
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
}
