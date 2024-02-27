package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllBlackPatient;
import cn.cshao.common.model.slldb.SllBlackPatientExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SllBlackPatientMapper {
    long countByExample(SllBlackPatientExample example);

    int deleteByExample(SllBlackPatientExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SllBlackPatient record);

    int insertSelective(SllBlackPatient record);

    List<SllBlackPatient> selectByExample(SllBlackPatientExample example);

    SllBlackPatient selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SllBlackPatient record, @Param("example") SllBlackPatientExample example);

    int updateByExample(@Param("record") SllBlackPatient record, @Param("example") SllBlackPatientExample example);

    int updateByPrimaryKeySelective(SllBlackPatient record);

    int updateByPrimaryKey(SllBlackPatient record);
}