package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllAgRgnRel;
import cn.cshao.common.model.slldb.SllAgRgnRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SllAgRgnRelMapper {
    long countByExample(SllAgRgnRelExample example);

    int deleteByExample(SllAgRgnRelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SllAgRgnRel record);

    int insertSelective(SllAgRgnRel record);

    List<SllAgRgnRel> selectByExample(SllAgRgnRelExample example);

    SllAgRgnRel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SllAgRgnRel record, @Param("example") SllAgRgnRelExample example);

    int updateByExample(@Param("record") SllAgRgnRel record, @Param("example") SllAgRgnRelExample example);

    int updateByPrimaryKeySelective(SllAgRgnRel record);

    int updateByPrimaryKey(SllAgRgnRel record);
}