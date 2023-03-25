package cn.cshao.user.cmpt.security.model;

import com.hspharm.pharma.cmpt.security.cons.SecurityConstants;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Desc 授权用户信息
 * @Author hub5
 * @Date 2022/11/9 16:57
 * @Return {@link }
 **/
@Data
public class AuthUser implements Serializable {

    private static final long serialVersionUID = 7537238429748172182L;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "用户编码")
    private String userNo;

    @ApiModelProperty(value = "用户名称")
    private String userNm;

    @ApiModelProperty(value = "全称")
    private String fullName;

    @ApiModelProperty(value = "简称")
    private String shortName;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "电话号码")
    private String phoneNumber;

    @ApiModelProperty(value = "角色集合")
    private String[] roles;

    @ApiModelProperty(value = "权限标记集合")
    private String[] permissions;

    public Boolean isSuperAdmin() {
        return Arrays.asList(this.roles).contains(SecurityConstants.SUPER_ADMIN);
    }

}
