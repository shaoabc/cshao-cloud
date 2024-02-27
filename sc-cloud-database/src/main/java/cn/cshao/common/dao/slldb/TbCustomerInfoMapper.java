package cn.cshao.common.dao.slldb;

import cn.cshao.common.model.slldb.TbCustomerInfo;
import cn.cshao.common.model.slldb.TbCustomerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCustomerInfoMapper {
    long countByExample(TbCustomerInfoExample example);

    int deleteByExample(TbCustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustomerInfo record);

    int insertSelective(TbCustomerInfo record);

    List<TbCustomerInfo> selectByExample(TbCustomerInfoExample example);

    TbCustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCustomerInfo record, @Param("example") TbCustomerInfoExample example);

    int updateByExample(@Param("record") TbCustomerInfo record, @Param("example") TbCustomerInfoExample example);

    int updateByPrimaryKeySelective(TbCustomerInfo record);

    int updateByPrimaryKey(TbCustomerInfo record);
}