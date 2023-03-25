package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllOperateLog;
import cn.cshao.common.model.slldb.SllOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SllOperateLogMapper {
    long countByExample(SllOperateLogExample example);

    int deleteByExample(SllOperateLogExample example);

    int deleteByPrimaryKey(Long opId);

    int insert(SllOperateLog record);

    int insertSelective(SllOperateLog record);

    List<SllOperateLog> selectByExample(SllOperateLogExample example);

    SllOperateLog selectByPrimaryKey(Long opId);

    int updateByExampleSelective(@Param("record") SllOperateLog record, @Param("example") SllOperateLogExample example);

    int updateByExample(@Param("record") SllOperateLog record, @Param("example") SllOperateLogExample example);

    int updateByPrimaryKeySelective(SllOperateLog record);

    int updateByPrimaryKey(SllOperateLog record);
}