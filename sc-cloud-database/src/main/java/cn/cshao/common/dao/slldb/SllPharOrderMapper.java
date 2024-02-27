package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllPharOrder;
import cn.cshao.common.model.slldb.SllPharOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SllPharOrderMapper {
    long countByExample(SllPharOrderExample example);

    int deleteByExample(SllPharOrderExample example);

    int deleteByPrimaryKey(Long ordId);

    int insert(SllPharOrder record);

    int insertSelective(SllPharOrder record);

    List<SllPharOrder> selectByExample(SllPharOrderExample example);

    SllPharOrder selectByPrimaryKey(Long ordId);

    int updateByExampleSelective(@Param("record") SllPharOrder record, @Param("example") SllPharOrderExample example);

    int updateByExample(@Param("record") SllPharOrder record, @Param("example") SllPharOrderExample example);

    int updateByPrimaryKeySelective(SllPharOrder record);

    int updateByPrimaryKey(SllPharOrder record);
}