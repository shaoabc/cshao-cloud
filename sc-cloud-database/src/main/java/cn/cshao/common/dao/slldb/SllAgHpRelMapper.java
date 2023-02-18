package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllAgHpRel;
import cn.cshao.common.model.slldb.SllAgHpRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SllAgHpRelMapper {
    long countByExample(SllAgHpRelExample example);

    int deleteByExample(SllAgHpRelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SllAgHpRel record);

    int insertSelective(SllAgHpRel record);

    List<SllAgHpRel> selectByExample(SllAgHpRelExample example);

    SllAgHpRel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SllAgHpRel record, @Param("example") SllAgHpRelExample example);

    int updateByExample(@Param("record") SllAgHpRel record, @Param("example") SllAgHpRelExample example);

    int updateByPrimaryKeySelective(SllAgHpRel record);

    int updateByPrimaryKey(SllAgHpRel record);
}