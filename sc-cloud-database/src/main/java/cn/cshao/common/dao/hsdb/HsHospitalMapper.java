package cn.cshao.common.dao.hsdb;

import cn.cshao.common.model.hsdb.HsHospital;
import cn.cshao.common.model.hsdb.HsHospitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HsHospitalMapper {
    long countByExample(HsHospitalExample example);

    int deleteByExample(HsHospitalExample example);

    int deleteByPrimaryKey(Integer hospId);

    int insert(HsHospital record);

    int insertSelective(HsHospital record);

    List<HsHospital> selectByExample(HsHospitalExample example);

    HsHospital selectByPrimaryKey(Integer hospId);

    int updateByExampleSelective(@Param("record") HsHospital record, @Param("example") HsHospitalExample example);

    int updateByExample(@Param("record") HsHospital record, @Param("example") HsHospitalExample example);

    int updateByPrimaryKeySelective(HsHospital record);

    int updateByPrimaryKey(HsHospital record);
}