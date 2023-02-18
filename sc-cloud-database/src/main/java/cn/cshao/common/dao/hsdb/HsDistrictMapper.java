package cn.cshao.common.dao.hsdb;

import cn.cshao.common.model.hsdb.HsDistrict;
import cn.cshao.common.model.hsdb.HsDistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HsDistrictMapper {
    long countByExample(HsDistrictExample example);

    int deleteByExample(HsDistrictExample example);

    int deleteByPrimaryKey(Integer distId);

    int insert(HsDistrict record);

    int insertSelective(HsDistrict record);

    List<HsDistrict> selectByExample(HsDistrictExample example);

    HsDistrict selectByPrimaryKey(Integer distId);

    int updateByExampleSelective(@Param("record") HsDistrict record, @Param("example") HsDistrictExample example);

    int updateByExample(@Param("record") HsDistrict record, @Param("example") HsDistrictExample example);

    int updateByPrimaryKeySelective(HsDistrict record);

    int updateByPrimaryKey(HsDistrict record);
}