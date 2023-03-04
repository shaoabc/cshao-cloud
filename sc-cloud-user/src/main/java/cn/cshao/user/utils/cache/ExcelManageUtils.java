package cn.cshao.user.utils.cache;

import cn.cshao.user.dto.excel.ExcelCheckOutput;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.enums.WriteDirectionEnum;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.alibaba.excel.write.metadata.fill.FillWrapper;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.annotation.Id;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author lianhf
 * @Description 导出Excel工具
 * @Date 2022/3/18 6:10 PM
 */
@Slf4j
public class ExcelManageUtils {

    /**
     * 导出复杂表头的Excel 先单组数据填充，再多组数据填充
     * @param response
     * @param sheets 单组数据Map
     * @param outFileName 导出的Excel名称
     * @param templatePath Excel模板的路径名称
     * @throws Exception
     */
    public static void exportExcel(HttpServletResponse response
            , List<SheetEntry> sheets, String outFileName
            , String templatePath) throws Exception {
        ExcelWriter excelWriter = EasyExcel
                .write(getOutputStream(outFileName, response))
                .withTemplate(templatePath).build();
        if (null != sheets && sheets.size() > 0) {
            sheets.stream().forEach(sheet -> {
                WriteSheet writeSheet = EasyExcel.writerSheet(sheet.getSheetNo()).build();
                FillConfig fillConfig = FillConfig.builder()
                        .direction(WriteDirectionEnum.VERTICAL)
                        .forceNewRow(Boolean.FALSE).build();
                if (null != sheet.getList()) {
                    excelWriter.fill(new FillWrapper(sheet.getList()), fillConfig, writeSheet);
                }
                if (null != sheet.getWords()) {
                    excelWriter.fill(sheet.getWords(), writeSheet);
                }
            });
        }
        excelWriter.finish();
    }

    /**
     * @Desc 字符替换实体
     * @Author hub5
     * @Date 2022/11/14 15:40
     * @Return {@link }
     **/
    @Data
    public static class SheetEntry {
        private Integer sheetNo;
        private Object words;
        private List<? extends BaseRowModel> list;

        public SheetEntry(Integer sheetNo, Object words, List<? extends BaseRowModel> list) {
            this.sheetNo = sheetNo;
            this.words = words;
            this.list = list;
        }
    }

    /**
     * @Desc 输出到自定义流
     * @Author hub5
     * @Date 2022/9/13 12:17
     * @Return {@link }
     **/
    public static void exportExcel(OutputStream out
            , List<? extends BaseRowModel> list, Object replace, String tempPath) {
        /*.write(ExcelUtil.getOutputStream(outFileName, response))
            是将数据写入文件，并交给response*/
        //.withTemplate(templateFileName)就是读取模板
        ExcelWriter excelWriter = EasyExcel
                .write(out)
                .withTemplate(tempPath).build();
        //创建Sheet
        //设置excel Sheet为第几张并设置名称
        //.writerSheet(0,"第一个")中前面的参数为sheetNo,就是第几张sheet
        //第二参数为sheet名称
        //不写就是默认
        WriteSheet writeSheet = EasyExcel.writerSheet().build();
        /*这里注意 入参用了forceNewRow 代表在写入list的时候不管list下面有没有空行
            都会创建一行，然后下面的数据往后移动。默认 是false，会直接使用下一行，如果没有则创建。*/
        // forceNewRow 如果设置了true,有个缺点 就是他会把所有的数据都放到内存了，所以慎用
        //.direction(WriteDirectionEnum.VERTICAL)这个是设置list填入的时候是纵向填入
        /*简单的说 如果你的模板有list,且list不是最后一行，下面还有数据需要填充
         就必须设置 forceNewRow=true 但是这个就会把所有数据放到内存 会很耗内存*/
        FillConfig fillConfig = FillConfig.builder()
                .direction(WriteDirectionEnum.VERTICAL)
                .forceNewRow(Boolean.FALSE).build();
        //这里是将list填充到excel中。
        /*会去找模板上对应的数据填入，例如模板中的{list.getGoodsName}
            就是下面List集合中名为goodsName字段对应的数据*/
        /*new FillWrapper("list", selectOrderDTO.getSelectOrderGoodsDTOS())
            前面的参数是设置一个填入的list名*/
        //后面的参数是获得的list，里面就包含了要填入的数据
        //.fill()主要就是将数据填入excel中
        excelWriter.fill(new FillWrapper(list), fillConfig, writeSheet);
        //这里是将一些普通数据放到map中，方便填入，可以看getStringObjectMap()。
        //map的String是对应的名称，Object就是数据了。
        //将数据填入
        excelWriter.fill(replace, writeSheet);
        //关闭
        excelWriter.finish();
    }

    /**
     * 这是ExcelUtil.getOutputStream
     * 这里就是将文件下载交给了浏览器
     */
    public static OutputStream getOutputStream(String Name
            , HttpServletResponse response) throws Exception {
        //这里是对文件的重命名
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        String date = sdf.format(new Date());
        String fileName = new String(Name.getBytes(), "UTF8") + date + ".xlsx";
        //告诉response下载的是excel文件
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("UTF-8");
        // 这里文件名如果涉及中文一定要使用URL编码,否则会乱码
        response.setContentType("application/force-download");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        return response.getOutputStream();
    }

    /**
     * @Desc excel导入，基础校验
     * @Author hub5
     * @Date 2022/4/7 17:33
     * @Return {@link }
     **/
    @SneakyThrows
    public static <T> List<ExcelCheckOutput> NotNullAndRepeatCheck(List<T> entityList, Class<T> beanClass) {
        List<ExcelCheckOutput> checkOutputs = new ArrayList<>();
        // 1、数据空校验
        if (CollectionUtils.isEmpty(entityList)) {
            ExcelCheckOutput output = new ExcelCheckOutput();
            output.setExcelRow(-1);
            output.setExcelCol(-1);
            output.setErrorMsg("模板中未检测到数据！");
            checkOutputs.add(output);
            return checkOutputs;
        }

        PropertyDescriptor[] pds = Introspector.getBeanInfo(beanClass).getPropertyDescriptors();
        AtomicInteger row = new AtomicInteger(1);
        Map<String, Integer> exRepeatMap = new HashMap<>(); // 模板内重复
        entityList.forEach(entity -> {
            row.incrementAndGet();
            for (PropertyDescriptor pd : pds) {
                String pdName = pd.getName();
                if (!pdName.equals("class")) {
                    try {
                        Field field = beanClass.getDeclaredField(pdName);
                        if (null != field && field.isAnnotationPresent(ExcelProperty.class)) {
                            // 2、字段非空性校验
                            if (field.isAnnotationPresent(NotNull.class)
                                    && null == pd.getReadMethod().invoke(entity)) {
                                ExcelCheckOutput output = new ExcelCheckOutput();
                                output.setExcelRow(row.get());
                                output.setExcelCol(field.getAnnotation(ExcelProperty.class).index() + 1);
                                output.setErrorMsg(field.getAnnotation(NotNull.class).message());
                                checkOutputs.add(output);
                            }
                            // 3、模板内数据重复性校验
                            Object fieldValue = null;
                            if (field.isAnnotationPresent(Id.class)
                                    && null != (fieldValue = pd.getReadMethod().invoke(entity))) {
                                String key = field.getName() + fieldValue;
                                Integer col = field.getAnnotation(ExcelProperty.class).index() + 1;
                                if (exRepeatMap.containsKey(key)) {
                                    ExcelCheckOutput output = new ExcelCheckOutput();
                                    output.setExcelRow(row.get());
                                    output.setExcelCol(col);
                                    output.setErrorMsg("当前单元格数据与第【" + exRepeatMap.get(key) + "】行存在重复！");
                                    checkOutputs.add(output);
                                } else {
                                    exRepeatMap.put(key, row.get());
                                }
                            }
                        }

                    } catch (NoSuchFieldException
                            | IllegalAccessException
                            | InvocationTargetException e) {
                        ;
                    }
                }
            }
        });
        return checkOutputs;
    }


}
