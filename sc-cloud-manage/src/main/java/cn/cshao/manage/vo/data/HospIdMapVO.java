package cn.cshao.manage.vo.data;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shaochen
 */
@Data
public class HospIdMapVO implements Serializable {
    private static final long serialVersionUID = 8782692508050274414L;
    private Integer hospId;
    private String hospNo;
    private String hospNm;
    private Integer distId;

    public HospIdMapVO(Integer hospId, String hospNo, String hospNm, Integer distId) {
        this.hospId = hospId;
        this.hospNo = hospNo;
        this.hospNm = hospNm;
        this.distId = distId;
    }
}
