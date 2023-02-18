package cn.cshao.manage.vo.manage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-18 3:25 下午
 */
@Data
@ApiModel("字典返回VO")
public class HsDictVO implements Serializable {

    @ApiModelProperty("地区信息")
    private List<DistrictInfo> districtInfoList;
    @ApiModelProperty("医院信息")
    private List<HospitalInfo> hospitalInfoList;

    @Data
    public static class DistrictInfo implements  Serializable{
        @ApiModelProperty("地区ID")
        private Integer distId;
        @ApiModelProperty("行政区划名称")
        private String  distNm;
        @ApiModelProperty("等级")
        private Long level;
        @ApiModelProperty("等级名称")
        private String  levelDesc;
        @ApiModelProperty("上级ID")
        private Integer upId;
        @ApiModelProperty("备注描述")
        private String  desc;
        @ApiModelProperty("创建人")
        private String createUser;
        @ApiModelProperty("创建时间")
        private Date createTime;
        @ApiModelProperty("更新人")
        private String updateUser;
        @ApiModelProperty("更新时间")
        private Date updateTime;
    }
    @Data
    public static class HospitalInfo implements Serializable{
        @ApiModelProperty("医院ID")
        private Integer hospId;
        @ApiModelProperty("医院编码")
        private String hospNo;
        @ApiModelProperty("医院名称")
        private String hospNm;
        @ApiModelProperty("别名")
        private String alias;
        @ApiModelProperty("地区关联ID")
        private Integer distId;
        @ApiModelProperty("详细地址")
        private String addr;
        @ApiModelProperty("医院类型（1:妇幼;2:精神;3:康复护理;4:其他专科;5:中医;6:肿瘤;7:综合）")
        private Byte clazz;
        @ApiModelProperty("医院性质（1:军队医院;2:其他;3:市级公立;4:卫生院/卫生服务中心;5:县区公立;6:诊所/医务室;7:空白）")
        private Byte nature;
        @ApiModelProperty("医院级别（1:一级;2:二级;3:三级）")
        private Byte grade;
        @ApiModelProperty("启用状态（1:启用;2:停用）")
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
}
