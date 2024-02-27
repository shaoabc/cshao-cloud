package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllStockDetail;
import cn.cshao.common.model.slldb.SllStockDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SllStockDetailMapper {
    long countByExample(SllStockDetailExample example);

    int deleteByExample(SllStockDetailExample example);

    int deleteByPrimaryKey(Long stdId);

    int insert(SllStockDetail record);

    int insertSelective(SllStockDetail record);

    List<SllStockDetail> selectByExample(SllStockDetailExample example);

    SllStockDetail selectByPrimaryKey(Long stdId);

    int updateByExampleSelective(@Param("record") SllStockDetail record, @Param("example") SllStockDetailExample example);

    int updateByExample(@Param("record") SllStockDetail record, @Param("example") SllStockDetailExample example);

    int updateByPrimaryKeySelective(SllStockDetail record);

    int updateByPrimaryKey(SllStockDetail record);
}