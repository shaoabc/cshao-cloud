package cn.cshao.manage.service;

import cn.cshao.common.dao.hsdb.HsHospitalMapper;
import cn.cshao.common.dao.slldb.SllAgentMapper;
import cn.cshao.common.model.hsdb.HsHospital;
import cn.cshao.common.model.hsdb.HsHospitalExample;
import cn.cshao.common.model.slldb.SllAgent;
import cn.cshao.common.model.slldb.SllAgentExample;
import cn.cshao.manage.dto.manage.ItemDTO;
import cn.cshao.manage.vo.CommonItemVO;
import com.alibaba.fastjson.JSON;
import cs.cshao.common.utils.map.ModelMapUtils;
import cs.cshao.common.utils.string.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-18 12:06 上午
 */
@Service
@Slf4j
public class SwaggerService {

    @Resource
    private HsHospitalMapper hsHospitalMapper;
    @Resource
    private SllAgentMapper sllAgentMapper;

    /**
     * 获取公共属性--医院信息
     * @param dto
     * @return
     */
    public CommonItemVO queryCommonItemPageList(ItemDTO dto) {
        CommonItemVO itemVO =new CommonItemVO();
        HsHospitalExample example =new HsHospitalExample();
        example.setOrderByClause("hosp_id");
        HsHospitalExample.Criteria criteria =example.createCriteria();
        if(StringUtils.isNotBlank(dto.getName())){
            criteria.andHospNmLike("%"+dto.getName().trim()+"%");
        }
        List<HsHospital> hsHospitalList =hsHospitalMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(hsHospitalList)){
            itemVO.setHospitalInfoList(ModelMapUtils.mapList(hsHospitalList,CommonItemVO.HospitalInfo.class));
        }
        // 第二个数据源测试
        SllAgentExample agentExample =new SllAgentExample();
        agentExample.setOrderByClause("ag_id");
        SllAgentExample.Criteria criteria1 =agentExample.createCriteria();
        if(StringUtils.isNotBlank(dto.getName())){
            criteria1.andAgNmLike("%"+dto.getName().trim()+"%");
        }
        List<SllAgent> sllAgentList =sllAgentMapper.selectByExample(agentExample);
        if(CollectionUtils.isNotEmpty(sllAgentList)){
            log.info("多数据源配置,{}", JSON.toJSONString(sllAgentList));
        }

        return itemVO;
    }
}
