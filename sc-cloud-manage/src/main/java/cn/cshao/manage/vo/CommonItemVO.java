package cn.cshao.manage.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-16 2:47 下午
 */
@Data
public class CommonItemVO implements Serializable {
    private static final long serialVersionUID = 6992245299002194769L;

    @ApiModelProperty("部门信息")
    private List<DeptInfo> deptInfoList;
    @ApiModelProperty("药品信息")
    private List<MedicineInfo> medicineInfoList;
    @ApiModelProperty("药店信息")
    private List<PharmacyInfo> pharmacyInfoList;
    @ApiModelProperty("医院信息")
    private List<HospitalInfo> hospitalInfoList;

    @Data
    public static class DeptInfo implements Serializable{
        @ApiModelProperty("部门ID")
        private Integer deptId;
        @ApiModelProperty("部门名称")
        private String  deptNm;
        @ApiModelProperty("部门编号")
        private String  deptNo ;
    }
    @Data
    public static class MedicineInfo implements Serializable{
         @ApiModelProperty("药品ID")
         private Long mdId ;
         @ApiModelProperty("药品编号")
         private String mdNo;
         @ApiModelProperty("药品名称")
         private String mdNm;
         @ApiModelProperty("规格")
         private String specs;
         @ApiModelProperty("单位")
         private String unit;
    }
    @Data
    public static class PharmacyInfo implements Serializable{
         @ApiModelProperty("药店ID")
         private Long phId ;
         @ApiModelProperty("药店编码")
         private String phNo;
         @ApiModelProperty("药店名称")
         private String phNm;
         @ApiModelProperty("终端类型（0买药药店；1援助药店；3买援药店）")
         private Long type ;
    }
    @Data
    public static class HospitalInfo implements Serializable{
        @ApiModelProperty("医院ID")
        private Long hospId ;
        @ApiModelProperty("医院编码")
        private String hospNo;
        @ApiModelProperty("医院名称")
        private String hospNm;

    }
}
