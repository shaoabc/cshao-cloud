package cs.cshao.common.utils.bank.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc
 * @Author cshao
 * @Date 2022/12/12 17:00
 **/
@Data
public class BankCardDistBean implements Serializable {
    private static final long serialVersionUID = 1559294760464911846L;
    private String msg;
    private String success;
    private Integer code;
    private BankCityInfo data;

    @Data
    public static class BankCityInfo {
        private String orderNo;
        private String bank;
        private String province;
        private String city;
    }
}
