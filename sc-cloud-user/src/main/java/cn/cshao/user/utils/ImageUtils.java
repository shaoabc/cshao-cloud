package cn.cshao.user.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-01-04 5:51 下午
 */
@Slf4j
public class ImageUtils {
    /**
     * 当前程序所在文件目录
     */
    private static final String ROOT_FOLDER = new File("").getAbsolutePath();
    /**
     *  文件地址前缀拼接（可根据实际场景自定义）
     */
    String PATH_PREFEX = ROOT_FOLDER + File.separator + "QRimages" + File.separator;

//    public static   LePayPatientOutput imageQr(LePayPatientOutput output){
//        String dateToString = DateUtils.dateToString(new Date(), "yyyyMMddHHmmss");
//        String filePath=new File("").getAbsolutePath() + File.separator + "QRimages" + File.separator ;
//        File file = new File(filePath);
//        cn.yungongbao.manage.utils.QRCodeUtil.createCodeToFile(JSON.toJSONString(output),file,dateToString+".png");
//        //将图片转换成Bash64
//        String imgBase = getImgBase(filePath+dateToString+".png");
//        LePayPatientOutput paramOutput = cn.yungongbao.manage.utils.ModelMapUtils.map(output, LePayPatientOutput.class);
//        paramOutput.setImageBase64(imgBase);
//        //删除图片
//        File imageFile = new File(filePath+dateToString+".png");
//        deleteFile(imageFile);
//        return paramOutput;
//    }
    /**
     * 将图片转换成Base64编码
     * @param imgFile 待处理图片地址
     * @return
     */
    public static String getImgBase(String imgFile) {

        // 将图片文件转化为二进制流
        InputStream in = null;
        byte[] data = null;
        // 读取图片字节数组
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 图片头
        //String imghead = "data:image/jpeg;base64,";
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(data);
    }
    /**
     * 删除文件或文件夹
     *
     * @param: file 如果是文件删除该文件，如果是文件夹删除该文件夹以及下面的所有文件
     * @return void
     * @author lianhf
     * @date
     */
    public static void deleteFile(File file) {
        if (file.isFile()) {
            file.delete();
        } else {
            String[] childFilePaths = file.list();
            for (String childFilePath : childFilePaths) {
                File childFile = new File(file.getAbsolutePath() + "/" + childFilePath);
                deleteFile(childFile);
            }
            file.delete();
        }
    }
}
