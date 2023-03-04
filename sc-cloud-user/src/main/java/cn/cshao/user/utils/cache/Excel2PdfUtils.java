package cn.cshao.user.utils.cache;

import com.aspose.cells.License;
import com.aspose.cells.PdfSaveOptions;
import com.aspose.cells.Workbook;
import org.springframework.core.io.ClassPathResource;

import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @Desc:  excel转pdf
 * @Author: cshao
 * @Date: 2022/9/13 14:38
 **/
public class Excel2PdfUtils {
    /**
     * 获取license
     *
     * @return
     */
    public static boolean getLicense() {
        boolean result = false;
        try {
            ClassPathResource classPathResource = new ClassPathResource("license.xml");
            InputStream is = classPathResource.getInputStream();
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     * excel 转为pdf 输出。
     *
     * @param sourceFilePath  excel文件
     * @param desFilePathd  pad 输出文件目录
     */
    public static void excel2pdf(String sourceFilePath, String desFilePathd ){
        // 验证License 若不验证则转化出的pdf文档会有水印产生
        if (!getLicense()) {
            return;
        }
        try {
            Workbook wb = new Workbook(sourceFilePath);// 原始excel路径
            FileOutputStream fileOS = new FileOutputStream(desFilePathd);
            PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
            // 设置为true，表示将整个sheet打印到pdf的一整夜，导致pdf不分页
            // 设置为false，又会有格式问题，暂未解决
            pdfSaveOptions.setOnePagePerSheet(true);


            int[] autoDrawSheets={3};
            //当excel中对应的sheet页宽度太大时，在PDF中会拆断并分页。此处等比缩放。
//            autoDraw(wb,autoDrawSheets);

            int[] showSheets={0};
            //隐藏workbook中不需要的sheet页。
            printSheetPage(wb,showSheets);
            wb.save(fileOS, pdfSaveOptions);
            fileOS.flush();
            fileOS.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置打印的sheet 自动拉伸比例
     * @param wb
     * @param page 自动拉伸的页的sheet数组
     */
    public static void autoDraw(Workbook wb,int[] page){
        if(null!=page&&page.length>0){
            for (int i = 0; i < page.length; i++) {
                wb.getWorksheets().get(i).getHorizontalPageBreaks().clear();
                wb.getWorksheets().get(i).getVerticalPageBreaks().clear();
            }
        }
    }


    /**
     * 隐藏workbook中不需要的sheet页。
     * @param wb
     * @param page 显示页的sheet数组
     */
    public static void printSheetPage(Workbook wb,int[] page){
        for (int i= 1; i < wb.getWorksheets().getCount(); i++)  {
            wb.getWorksheets().get(i).setVisible(false);
        }
        if(null==page||page.length==0){
            wb.getWorksheets().get(0).setVisible(true);
        }else{
            for (int i = 0; i < page.length; i++) {
                wb.getWorksheets().get(i).setVisible(true);
            }
        }
    }

}
