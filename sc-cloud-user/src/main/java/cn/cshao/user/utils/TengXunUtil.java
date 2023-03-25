package cn.cshao.user.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cshao
 * @desc  使用腾讯ocr解析，发票解析，实名认证，需要购买腾讯云账号获取到该账号对应的【accessKeyId，accessKeySecret】
 * @company
 * @create 2022-11-20 3:50 下午
 */
@Component
@Slf4j
public class TengXunUtil {

    @Value(value = "${shoss.accessKeyId}")
    private  String accessKeyId;

    @Value(value = "${shoss.accessKeySecret}")
    private  String accessKeySecret;

    private  static final String REGION ="ap-shanghai";
    /**
     * 当前程序所在文件目录
     */
    private static final String ROOT_FOLDER = new File("").getAbsolutePath();
    /**
     *  文件地址前缀拼接（可根据实际场景自定义）
     */
    String PATH_PREFEX = ROOT_FOLDER + File.separator + "QRimages" + File.separator;

    public TengXunUtil() {

    }
    /**
     * 实名认证 手机号+姓名+身份证
     * @param authDTO
     * @return
     */
//    public  PhoneVerificationResponse authVerification(PatientAuthDTO authDTO) {
//        PhoneVerificationResponse resp = new PhoneVerificationResponse();
//        try {
//            Credential cred = new Credential(accessKeyId, accessKeySecret);
//            HttpProfile httpProfile = new HttpProfile();
//            httpProfile.setEndpoint("faceid.tencentcloudapi.com");
//            ClientProfile clientProfile = new ClientProfile();
//            clientProfile.setHttpProfile(httpProfile);
//            FaceidClient client = new FaceidClient(cred, "", clientProfile);
//            PhoneVerificationRequest req = new PhoneVerificationRequest();
//            req.setIdCard(authDTO.getCertNo());
//            req.setName(authDTO.getPaNm());
//            req.setPhone(authDTO.getMobile());
//            resp = client.PhoneVerification(req);
//            // 输出json格式的字符串回包
//            log.info("实名认证 成功获取信息结束--{},", PhoneVerificationResponse.toJsonString(resp));
//        } catch (TencentCloudSDKException e) {
//            log.error("实名认证  获取信息失败--{},", e.toString());
//        }
//        return  resp;
//    }



    /**
     * 身份证解析
     * @param pictureDTO
     * @return
     */
//    public  IDCardOCRResponse getIdCardInformation(PictureDTO pictureDTO) {
//        IDCardOCRResponse resp = new IDCardOCRResponse();
//        try {
//            Credential cred = new Credential(accessKeyId, accessKeySecret);
//            HttpProfile httpProfile = new HttpProfile();
//            httpProfile.setEndpoint("ocr.tencentcloudapi.com");
//            ClientProfile clientProfile = new ClientProfile();
//            clientProfile.setHttpProfile(httpProfile);
//            OcrClient client = new OcrClient(cred, REGION, clientProfile);
//            IDCardOCRRequest req = new IDCardOCRRequest();
//            req.setImageUrl(pictureDTO.getResURI());
//            resp = client.IDCardOCR(req);
//            //"https://cshao-bucket-1312859871.cos.ap-shanghai.myqcloud.com/XXXX"
//            log.info("身份证解析 成功获取信息结束--{},", IDCardOCRResponse.toJsonString(resp));
//        } catch (TencentCloudSDKException e) {
//            log.error("身份证解析  获取信息失败--{},", e.toString());
//        }
//        return resp;
//    }

    /**
     * OCR解析文本
     * @param resourceURI
     * @return
     */
//    public SmartStructuralOCRResponse smartStructuralOCR(ResourceURI resourceURI) {
//        SmartStructuralOCRResponse resp = new SmartStructuralOCRResponse();
//        try{
//            Credential cred = new Credential(accessKeyId, accessKeySecret);
//            HttpProfile httpProfile = new HttpProfile();
//            httpProfile.setEndpoint("ocr.tencentcloudapi.com");
//            ClientProfile clientProfile = new ClientProfile();
//            clientProfile.setHttpProfile(httpProfile);
//            OcrClient client = new OcrClient(cred, "ap-beijing", clientProfile);
//            SmartStructuralOCRRequest req = new SmartStructuralOCRRequest();
//            req.setImageUrl(resourceURI.getResURI());
//            resp = client.SmartStructuralOCR(req);
//            log.info("解析文本成功：======,{}",SmartStructuralOCRResponse.toJsonString(resp));
//        } catch (TencentCloudSDKException e) {
//            log.info("解析文本失败：=====,{}",e.toString());
//            e.printStackTrace();
//        }
//      return resp;
//    }

    /**
     * 医证发票调用腾讯接口解析
     */
//    public  RecognizeMedicalInvoiceOCRResponse getMedicalInvoiceOCR(ResourceURI resourceURI) {
//        RecognizeMedicalInvoiceOCRResponse resp = new RecognizeMedicalInvoiceOCRResponse();
//        try {
//            Credential cred = new Credential(accessKeyId, accessKeySecret);
//            HttpProfile httpProfile = new HttpProfile();
//            httpProfile.setEndpoint("ocr.tencentcloudapi.com");
//            ClientProfile clientProfile = new ClientProfile();
//            clientProfile.setHttpProfile(httpProfile);
//            OcrClient client = new OcrClient(cred, "ap-beijing", clientProfile);
//            RecognizeMedicalInvoiceOCRRequest req = new RecognizeMedicalInvoiceOCRRequest();
//            //https://cshao-bucket-1312859871.cos.ap-shanghai.myqcloud.com/id-bucketkey
//            req.setImageUrl(resourceURI.getResURI());
//            resp = client.RecognizeMedicalInvoiceOCR(req);
//            log.info("医证发票调用腾讯接口解析 获取内容为{},", RecognizeMedicalInvoiceOCRResponse.toJsonString(resp));
//        } catch (TencentCloudSDKException e) {
//            log.error("医证发票调用腾讯接口解析 OCR识别失败 {},", e.toString());
//            e.printStackTrace();
//        }
//        return resp;
//    }
    /**
     * 混合发票解析
     */
//    public  MixedInvoiceOCRResponse  getMixedInvoiceOCR(ResourceURI resourceURI){
//        MixedInvoiceOCRResponse resp =new MixedInvoiceOCRResponse();
//        try{
//            Credential cred = new Credential(accessKeyId, accessKeySecret);
//            HttpProfile httpProfile = new HttpProfile();
//            httpProfile.setEndpoint("ocr.tencentcloudapi.com");
//            ClientProfile clientProfile = new ClientProfile();
//            clientProfile.setHttpProfile(httpProfile);
//            OcrClient client = new OcrClient(cred, "ap-beijing", clientProfile);
//            MixedInvoiceOCRRequest req = new MixedInvoiceOCRRequest();
//            req.setImageUrl(resourceURI.getResURI());
//            resp = client.MixedInvoiceOCR(req);
//            log.info("发票调用腾讯接口解析 获取内容为{},", MixedInvoiceOCRResponse.toJsonString(resp));
//        } catch (TencentCloudSDKException e) {
//            log.error("发票调用腾讯接口解析 OCR识别失败 {},", e.toString());
//            e.printStackTrace();
//        }
//        return resp;
//    }


    /*****************************二维码相关*******************************************************/

    /**
     *  生成二维码并以IO流的形式返回给前端展示
     * @param content 二维码的内容
     * @param width 二维码的宽
     * @param height 二维码的高
     * @return BitMatrix对象
     * */
    public static BitMatrix createCode(String content,int width,int height) throws IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        //其他参数，如字符集编码
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        //容错级别为H
        hints.put(EncodeHintType.ERROR_CORRECTION , ErrorCorrectionLevel.M);
        //白边的宽度，可取0~4
        hints.put(EncodeHintType.MARGIN , 1);
        BitMatrix bitMatrix = null;
        try {
            //生成矩阵
            bitMatrix = new MultiFormatWriter().encode(content,
                    BarcodeFormat.QR_CODE, width, height, hints);
        } catch (WriterException e) {
            e.printStackTrace();
            log.error("二维码输出异常");
        }
        return bitMatrix;
    }
    /*****************************二维码相关*******************************************************/

    /**
     * 支持条形码/二维码扫描
     * @param resourceURI
     * @return
     */
//    public QrcodeOCRResponse QrcodeOCR(ResourceURI resourceURI) {
//        QrcodeOCRResponse resp = new QrcodeOCRResponse();
//        try {
//            Credential cred = new Credential(accessKeyId, accessKeySecret);
//            HttpProfile httpProfile = new HttpProfile();
//            httpProfile.setEndpoint("ocr.tencentcloudapi.com");
//            ClientProfile clientProfile = new ClientProfile();
//            clientProfile.setHttpProfile(httpProfile);
//            OcrClient client = new OcrClient(cred, "ap-beijing", clientProfile);
//            QrcodeOCRRequest req = new QrcodeOCRRequest();
//            req.setImageUrl(resourceURI.getResURI());
//            resp = client.QrcodeOCR(req);
//            log.info("二维码条形码识别成功：{},", QrcodeOCRResponse.toJsonString(resp));
//        } catch (TencentCloudSDKException e) {
//            log.error("二维码条形码识别失败：{},", e.getMessage());
//            throw new UserException("二维码条形码识别失败，原因：" + e.getMessage());
//        }
//        return resp;
//    }

    /***
     * 文件改为base64
     * @param commonDTO
     * @return
     */
//    public GetMedicineInfoVO imageQr(GetMedicineInfoVO commonDTO){
//        String dateToString = DateUtils.dateToString(new Date(), DateUtils.DATE_FORMATE_YYYYMMDDHHMMSS);
//        File file = new File(PATH_PREFEX);
//        QRCodeUtil.createCodeToFile(JSON.toJSONString(commonDTO),file,dateToString+".png");
//        //将图片转换成Bash64
//        String imgBase = ImageUtils.getImgBase(PATH_PREFEX+dateToString+".png");
//        GetMedicineInfoVO medicineInfoVO = ModelMapUtils.map(commonDTO, GetMedicineInfoVO.class);
//        medicineInfoVO.setImageBase64(imgBase);
//        //删除图片
//        File imageFile = new File(PATH_PREFEX+dateToString+".png");
//        ImageUtils.deleteFile(imageFile);
//        return medicineInfoVO;
//    }

    public static void main(String[] args) {
         //ResourceURI resourceURI =new ResourceURI();
//        resourceURI.setResURI("https://cshao-bucket-1312859871.cos.ap-shanghai.myqcloud.com/lab_1234");
//        TengXunUtil tengXunUtil =new TengXunUtil();
//        SmartStructuralOCRResponse resp = tengXunUtil.smartStructuralOCR(resourceURI);
//        System.out.println(SmartStructuralOCRResponse.toJsonString(resp));
//        List<NameValueDTO> nameValueList =new ArrayList<>();
//        NameValueDTO nameValueDTO =new NameValueDTO();
//        JSONObject json =new JSONObject();
//        if(resp!=null){
//            int t =0;  String name ="";
//            StructuralItem [] structuralItems = resp.getStructuralItems();
//                   for(int i=0;i<structuralItems.length;i++){
//                        if(structuralItems[i].getValue().contains("前白蛋白")
//                          || structuralItems[i].getValue().contains("总蛋白")
//                          || structuralItems[i].getValue().contains("白蛋白")
//                          || structuralItems[i].getValue().contains("球蛋白")
//                          || structuralItems[i].getValue().contains("白球比例")
//                          || structuralItems[i].getValue().contains("丙氨酸氨基转移酶")
//                          || structuralItems[i].getValue().contains("天门冬氨酸氨基转移酶")
//                          || (structuralItems[i].getValue().contains("谷丙")||structuralItems[i].getValue().contains("谷草"))
//                          || structuralItems[i].getValue().contains("碱性磷酸酶")
//                          || structuralItems[i].getValue().contains("总胆红素")
//                          || structuralItems[i].getValue().contains("总胆固醇")
//                          || structuralItems[i].getValue().contains("甘油三酯")
//                          || structuralItems[i].getValue().contains("高密度脂蛋白")
//                          || structuralItems[i].getValue().contains("低密度脂蛋白")
//                          || structuralItems[i].getValue().equals("钾")
//                          || structuralItems[i].getValue().equals("钠")
//                          || structuralItems[i].getValue().equals("氯")
//                          || structuralItems[i].getValue().contains("二氧化碳结合力")
//                          || structuralItems[i].getValue().contains("阴离子间隙")
//                          || structuralItems[i].getValue().equals("葡萄糖")
//                          || structuralItems[i].getValue().equals("尿素")
//                          || structuralItems[i].getValue().equals("肌酐")
//                          || structuralItems[i].getValue().equals("尿酸")
//                          || structuralItems[i].getValue().equals("钙")
//                          || structuralItems[i].getValue().equals("镁")
//                          || structuralItems[i].getValue().equals("磷")
//                          || structuralItems[i].getValue().equals("铁")
//                          || structuralItems[i].getValue().contains("总铁结合力")
//                          || structuralItems[i].getValue().contains("血清铁不饱和度")
//                          || structuralItems[i].getValue().contains("不饱和铁结合力")
//
//                          //测试
//                          || structuralItems[i].getValue().contains("平均血红蛋白量")
//                          || structuralItems[i].getValue().contains("平均血红蛋白浓度")
//                          || structuralItems[i].getValue().contains("血小板")
//                          || structuralItems[i].getValue().contains("血小板分布宽度")
//                          || structuralItems[i].getValue().contains("红细胞分布宽度")
//                        ){
//                          nameValueList.addAll(dealWithOcrNameValue(structuralItems[i].getValue(),i));
//                        }
//                   }
//                   if(CollectionUtils.isNotEmpty(nameValueList)){
//                       for(NameValueDTO value :nameValueList ){
//                           String valueStr =  structuralItems[value.getIndex()+1].getValue();
//                           if(!valueStr.matches("-?[0-9]+.?[0-9]*")){
//                               valueStr =  structuralItems[value.getIndex()+2].getValue();
//                           }
//                           if(!valueStr.matches("-?[0-9]+.?[0-9]*")){
//                               valueStr =  structuralItems[value.getIndex()+3].getValue();
//                           }
//                           if(!valueStr.matches("-?[0-9]+.?[0-9]*")){
//                               valueStr =  structuralItems[value.getIndex()+4].getValue();
//                           }
//                           json.put(value.getName(),valueStr);
//                       }
//                   }
//        }
//       System.out.println(json);
    }





}
