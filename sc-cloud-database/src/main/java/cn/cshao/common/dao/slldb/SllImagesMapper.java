package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllImages;
import cn.cshao.common.model.slldb.SllImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SllImagesMapper {
    long countByExample(SllImagesExample example);

    int deleteByExample(SllImagesExample example);

    int deleteByPrimaryKey(Long resNo);

    int insert(SllImages record);

    int insertSelective(SllImages record);

    List<SllImages> selectByExample(SllImagesExample example);

    SllImages selectByPrimaryKey(Long resNo);

    int updateByExampleSelective(@Param("record") SllImages record, @Param("example") SllImagesExample example);

    int updateByExample(@Param("record") SllImages record, @Param("example") SllImagesExample example);

    int updateByPrimaryKeySelective(SllImages record);

    int updateByPrimaryKey(SllImages record);
}