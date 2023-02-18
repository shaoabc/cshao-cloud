package cn.cshao.manage.service;

import cn.cshao.common.dao.hsdb.HsDistrictMapper;
import cn.cshao.common.dao.hsdb.HsHospitalMapper;
import cn.cshao.common.model.hsdb.HsDistrict;
import cn.cshao.common.model.hsdb.HsDistrictExample;
import cn.cshao.common.model.hsdb.HsHospital;
import cn.cshao.common.model.hsdb.HsHospitalExample;
import cn.cshao.manage.dto.manage.DictDTO;
import cn.cshao.manage.vo.manage.HsDictVO;
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
 * @create 2023-02-18 3:12 下午
 */
@Slf4j
@Service
public class HsDictService {

    @Resource
    private HsHospitalMapper hsHospitalMapper;

    @Resource
    private HsDistrictMapper hsDistrictMapper;
    /**
     * 分页查询医院信息
     * @param dto
     * @return
     */
    public PageInfo<HsDictVO> queryHospitalPageList(DictDTO dto) {
        HsHospitalExample hsHospitalExample =new HsHospitalExample();
        hsHospitalExample.setOrderByClause("hosp_Id");
        HsHospitalExample.Criteria  hsSriteria =hsHospitalExample.createCriteria();
        if(StringUtils.isNotBlank(dto.getName())){
            hsSriteria.andHospNmLike("%"+dto.getName().trim()+"%");
        }
        if(null !=dto.getId()){
            hsSriteria.andHospIdEqualTo(dto.getId());
        }
        PageHelper.startPage(dto.getPageNum(),dto.getPageSize());
        List<HsHospital> hsHospitalList =hsHospitalMapper.selectByExample(hsHospitalExample);
        if(CollectionUtils.isNotEmpty(hsHospitalList)){
            List<HsDictVO.HospitalInfo> hospitalInfoList = ModelMapUtils.mapList(hsHospitalList,HsDictVO.HospitalInfo.class);
            PageInfo pageInfo =new PageInfo(hospitalInfoList);
            pageInfo.setList(hospitalInfoList);
            return pageInfo ;
        }
        return new PageInfo<>(new ArrayList<>());
    }
    /**
     * 分页查询地区信息
     * @param dto
     * @return
     */
    public PageInfo<HsDictVO> queryDistrictPageList(DictDTO dto) {
        HsDistrictExample hsDistrictExample =new HsDistrictExample();
        hsDistrictExample.setOrderByClause("dist_id");
        HsDistrictExample.Criteria criteria = hsDistrictExample.createCriteria();
        if(StringUtils.isNotBlank(dto.getName())){
            criteria.andDistNmLike("%"+dto.getName().trim()+"%");
        }
        if(null !=dto.getId()){
            criteria.andDistIdEqualTo(dto.getId());
        }
        PageHelper.startPage(dto.getPageNum(),dto.getPageSize());
        List<HsDistrict> hsDistrictList =hsDistrictMapper.selectByExample(hsDistrictExample);
        if(CollectionUtils.isNotEmpty(hsDistrictList)){
            List<HsDictVO.DistrictInfo> districtInfoList =ModelMapUtils.mapList(hsDistrictList,HsDictVO.DistrictInfo.class);
            PageInfo pageInfo =new PageInfo(districtInfoList);
            pageInfo.setList(districtInfoList);
            return pageInfo;
        }
        return new PageInfo<>(new ArrayList<>());
    }
}
