package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllMedicine;
import cn.cshao.common.model.slldb.SllMedicineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SllMedicineMapper {
    long countByExample(SllMedicineExample example);

    int deleteByExample(SllMedicineExample example);

    int deleteByPrimaryKey(Long mdId);

    int insert(SllMedicine record);

    int insertSelective(SllMedicine record);

    List<SllMedicine> selectByExample(SllMedicineExample example);

    SllMedicine selectByPrimaryKey(Long mdId);

    int updateByExampleSelective(@Param("record") SllMedicine record, @Param("example") SllMedicineExample example);

    int updateByExample(@Param("record") SllMedicine record, @Param("example") SllMedicineExample example);

    int updateByPrimaryKeySelective(SllMedicine record);

    int updateByPrimaryKey(SllMedicine record);
}