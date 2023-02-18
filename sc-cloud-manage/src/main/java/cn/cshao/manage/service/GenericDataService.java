package cn.cshao.manage.service;

import cn.cshao.common.dao.hsdb.HsDistrictMapper;
import cn.cshao.common.dao.hsdb.HsHospitalMapper;
import cn.cshao.common.model.hsdb.HsDistrict;
import cn.cshao.common.model.hsdb.HsDistrictExample;
import cn.cshao.common.model.hsdb.HsHospital;
import cn.cshao.common.model.hsdb.HsHospitalExample;
import cn.cshao.manage.vo.data.HospIdMapVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc: 通用数据服务
 * @Author: cshao
 * @Date: 2022/12/20 16:39
 **/
@Service
@Slf4j
public class GenericDataService {

    @Resource
    private HsDistrictMapper districtMapper;

    @Resource
    private HsHospitalMapper hospitalMapper;

    /**
     * @Desc 获取全部行政区划
     * @Author cshao
     * @Date 2022/12/15 10:49
     **/
    public List<HsDistrict> pullDistrict() {
        List<HsDistrict> districts = this.districtMapper.selectByExample(new HsDistrictExample());
        log.info("pullDistrict-size:{}", districts.size());
        return districts;
    }

    /**
     * @Desc 获取主键Map医院
     * @Author cshao
     * @Date 2022/12/17 15:55
     **/
    public Map<String, HospIdMapVO> pullMapHospital() {
        HsHospitalExample example =new HsHospitalExample();
        example.setOrderByClause("hosp_id");
        List<HsHospital> hospitals = this.hospitalMapper.selectByExample(example);
        log.info("pullMapHospital-size:{}", hospitals.size());
        if (CollectionUtils.isNotEmpty(hospitals)) {
            Map<String, HospIdMapVO> idMapHosp= new HashMap<>();
            hospitals.forEach(hp -> {
                idMapHosp.put(hp.getHospId().toString(), new HospIdMapVO(
                        hp.getHospId(), hp.getHospNo(), hp.getHospNm(), hp.getDistId()));
            });
            return idMapHosp;
        }
        return null;
    }
}
