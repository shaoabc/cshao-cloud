package cn.cshao.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-18 4:52 下午
 */
@Data
@ApiModel("志愿者信息DTO")
public class AgentDTO extends QueryPageDTO{
    private static final long serialVersionUID = -5947656612339133988L;
    @ApiModelProperty("志愿ID")
    private Long agId;
    @ApiModelProperty("志愿者编码")
    private String agNo;
    @ApiModelProperty("志愿者名称")
    private String agNm;
}
