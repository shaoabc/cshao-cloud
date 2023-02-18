package cn.cshao.user.vo.data;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author shaochen
 */
@Data
public class HospIdMapVO implements Serializable {
    private static final long serialVersionUID = 8782692508050274414L;
    @ApiModelProperty("医院ID")
    private Integer hospId;
    @ApiModelProperty("医院编号")
    private String hospNo;
    @ApiModelProperty("医院名称")
    private String hospNm;
    @ApiModelProperty("地区ID")
    private Integer distId;
}
