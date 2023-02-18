package cn.cshao.user.vo.agent;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-18 4:55 下午
 */
@Data
@ApiModel("志愿者信息出参")
public class AgentInfoVO implements Serializable {
    private static final long serialVersionUID = 551974356715364974L;
    @ApiModelProperty("志愿ID")
    private Long agId;
    @ApiModelProperty("志愿者编码")
    private String agNo;
    @ApiModelProperty("志愿者名称")
    private String agNm;
    @ApiModelProperty("类型")
    private Byte type;
    @ApiModelProperty("手机")
    private String mobile;
    @ApiModelProperty("药品ID")
    private String mdIdSet;
    @ApiModelProperty("科室ID")
    private Integer secId;
    @ApiModelProperty("办事处ID")
    private Integer offId;
    @ApiModelProperty("大区ID")
    private Integer rgnId;
    @ApiModelProperty("部门ID")
    private Integer deptId;
    @ApiModelProperty("状态")
    private Byte status;
    @ApiModelProperty("创建人")
    private String createUser;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("更新人")
    private String updateUser;
    @ApiModelProperty("更新时间")
    private Date updateTime;
}
