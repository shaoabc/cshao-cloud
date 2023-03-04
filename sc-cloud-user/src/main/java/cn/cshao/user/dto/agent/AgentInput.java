package cn.cshao.user.dto.agent;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-03-02 2:11 下午
 */
@Data
@ApiModel("志愿者信息")
public class AgentInput {
    @ApiModelProperty("志愿者信息名称")
    private String agentNm ;
    @ApiModelProperty("志愿者id")
    private Long agId ;
}
