package cn.cshao.manage.dto.manage;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-17 2:53 下午
 */
@Data
public class ItemDTO implements Serializable {
    @ApiModelProperty("支持模糊搜索内容")
    @NotBlank(message = "名称不能为空")
    private String name ;
}
