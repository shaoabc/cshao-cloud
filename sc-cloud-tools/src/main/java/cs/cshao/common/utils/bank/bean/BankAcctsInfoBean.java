package cs.cshao.common.utils.bank.bean;

import lombok.Data;

import java.util.List;

/**
 * @Desc 开户行信息
 * @Author cshao
 * @Date 2022/12/12 17:11
 **/
@Data
public class BankAcctsInfoBean {

    private RespInfo resp;

    private BankInfoBackOutput data;

    @Data
    public static class RespInfo {
        private String RespCode;
        private String RespMsg;
    }

    @Data
    public static class BankInfoBackOutput {
        private String page;
        private String bank;
        private String city;
        private String province;
        private String totalpage;
        private String card;
        private String key;
        private String totalcount;
        private List<RecordInfo> record;
        @Data
        public static class RecordInfo {
            private String addr;
            private String bank;
            private String city;
            private String province;
            private String bankCode;
            private String lName;
            private String tel;
        }
    }

}
