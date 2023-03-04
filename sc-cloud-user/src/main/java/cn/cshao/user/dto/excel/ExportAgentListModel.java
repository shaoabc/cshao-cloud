package cn.cshao.user.dto.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.metadata.BaseRowModel;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-03-02 2:13 下午
 */
@Data
@ApiModel("志愿者信息导出excel字段")
public class ExportAgentListModel extends BaseRowModel implements Serializable {
    private static final long serialVersionUID = 5208452970229256898L;
    @ExcelProperty(value = "志愿者姓名", index = 0)
    @NotNull(message = "志愿者姓名不能为空")
    @ColumnWidth(15)
    private String agNm;

    @ExcelProperty(value = "志愿者编码", index = 1)
    @NotNull(message = "志愿者不能为空")
    @ColumnWidth(15)
    private String agNo;

    @ExcelProperty(value = "类型", index = 2)
    @NotNull(message = "类型不能为空")
    @ColumnWidth(15)
    private Byte type;

    @ExcelProperty(value = "手机号码", index = 3)
    @NotNull(message = "手机号码不能为空")
    @ColumnWidth(15)
    private String mobile;

}
