package cn.cshao.user.utils.oss.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Desc: cos桶信息
 * @Author: cshao
 * @Date: 2022/4/25 12:23
 **/
@Data
public class ResourceURI implements Serializable {
    private static final long serialVersionUID = 5863784643922933659L;
    @ApiModelProperty(value = "资源扩展名称")
    private String resNo;
    @ApiModelProperty(value = "资源定位标识")
    private String resURI;
    @ApiModelProperty(value = "资源扩展名称")
    private String resExt;
    @ApiModelProperty(value = "")
    private String type ;
    @ApiModelProperty(value = "资源类型排序")
    private Integer srcOrd;

    public ResourceURI() {
    }

    public ResourceURI(String resNo, String resURI) {
        this.resNo = resNo;
        this.resURI = resURI;
    }

    public ResourceURI(String resNo, String resURI, String resExt,Integer srcOrd) {
        this.resNo = resNo;
        this.resURI = resURI;
        this.resExt = resExt;
        this.srcOrd = srcOrd;
    }

}
