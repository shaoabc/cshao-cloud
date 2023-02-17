package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllAgent;
import cn.cshao.common.model.slldb.SllAgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SllAgentMapper {
    long countByExample(SllAgentExample example);

    int deleteByExample(SllAgentExample example);

    int deleteByPrimaryKey(Long agId);

    int insert(SllAgent record);

    int insertSelective(SllAgent record);

    List<SllAgent> selectByExample(SllAgentExample example);

    SllAgent selectByPrimaryKey(Long agId);

    int updateByExampleSelective(@Param("record") SllAgent record, @Param("example") SllAgentExample example);

    int updateByExample(@Param("record") SllAgent record, @Param("example") SllAgentExample example);

    int updateByPrimaryKeySelective(SllAgent record);

    int updateByPrimaryKey(SllAgent record);
}