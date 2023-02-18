package cn.cshao.manage.dto.manage;

import cn.cshao.manage.dto.QueryPageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-18 3:22 下午
 */
@ApiModel("字典查询")
@Data
public class DictDTO extends QueryPageDTO {
    private static final long serialVersionUID = -1617454326922174283L;
    @ApiModelProperty("字典ID")
    private Integer id ;
    @ApiModelProperty("名称--支持模糊查询")
    private String name ;
}
