package cn.cshao.user.dto.excel;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Desc:
 * @Author: hub5
 * @Date: 2022/4/5 14:20
 **/
@Data
public class ExcelCheckOutput implements Serializable {

    private static final long serialVersionUID = -5090063883349955211L;

    @ApiModelProperty(value = "行")
    private Integer excelRow;

    @ApiModelProperty(value = "列")
    private Integer excelCol;

    @ApiModelProperty(value = "级别（0错误；1警告）")
    private Integer errorLvl;

    @ApiModelProperty(value = "校验错误信息")
    private String errorMsg;

}
