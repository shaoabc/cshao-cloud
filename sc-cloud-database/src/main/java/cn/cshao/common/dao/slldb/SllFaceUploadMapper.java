package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.SllFaceUpload;
import cn.cshao.common.model.slldb.SllFaceUploadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SllFaceUploadMapper {
    long countByExample(SllFaceUploadExample example);

    int deleteByExample(SllFaceUploadExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SllFaceUpload record);

    int insertSelective(SllFaceUpload record);

    List<SllFaceUpload> selectByExample(SllFaceUploadExample example);

    SllFaceUpload selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SllFaceUpload record, @Param("example") SllFaceUploadExample example);

    int updateByExample(@Param("record") SllFaceUpload record, @Param("example") SllFaceUploadExample example);

    int updateByPrimaryKeySelective(SllFaceUpload record);

    int updateByPrimaryKey(SllFaceUpload record);
}