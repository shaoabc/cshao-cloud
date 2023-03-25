package cn.cshao.user.cmpt.security.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @fileName: JwtToken
 * @description: Jwt令牌
 * @author: 李阳
 * @create: 2020-04-27 23:16
 **/
@Data
public class JwtToken implements Serializable {

    private static final long serialVersionUID = -8353085705230355798L;

    @ApiModelProperty(value = "Token")
    private String accessToken;

    @ApiModelProperty(value = "Token请求前缀")
    private String tokenType;

    @ApiModelProperty(value = "Token过期时间,单位毫秒")
    private Long expiration;

    @ApiModelProperty(value = "header头变量名")
    private String headerName;
}
