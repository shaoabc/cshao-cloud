package cs.cshao.common.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.handler.SheetWriteHandler;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.data.annotation.Id;

import javax.servlet.http.HttpServletResponse;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author cshao
 * @Description 导出Excel工具
 * @Date 2022/3/18 6:10 PM
 */
@Slf4j
public class ExcelHandlerUtils {


    public static void writeExcel(HttpServletResponse response, List list, String fileName,
                                  String sheetName, Class clazz) {
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            String reFileName = URLEncoder.encode(fileName, "UTF-8");
            response.setHeader("Content-disposition", "attachment;filename=" + reFileName + ".xlsx");
            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
            EasyExcel.write(response.getOutputStream(), clazz)
                    .inMemory(true)
                    .sheet(sheetName).doWrite(list);
        } catch (IOException e) {
            log.error("write excel fail,io exception", e);
        }
    }

    /**
     * 导出excel
     *
     * @param response          输出流
     * @param dataList          导出的数据
     * @param clazz             模板类
     * @param sheetName         sheetName
     * @param cellWriteHandlers 样式处理类
     */
    public static void writeExcelWithRegisterWriteHandler(HttpServletResponse response, List dataList, String fileName,
                                                          String sheetName, Class clazz, SheetWriteHandler sheetWriteHandlers, CellWriteHandler... cellWriteHandlers) {
        try {

            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            String reFileName = URLEncoder.encode(fileName, "UTF-8");
            response.setHeader("Content-disposition", "attachment;filename=" + reFileName + ".xlsx");
            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
            writeWithTitleAndSpinnerHandler(response.getOutputStream(), sheetName, clazz, dataList, sheetWriteHandlers, cellWriteHandlers);
        } catch (IOException e) {
            log.error("write excel fail,io exception", e);
        }
    }

    private static void writeWithTitleAndSpinnerHandler(OutputStream outputStream, String sheetName, Class clazz, List dataList,
                                                        SheetWriteHandler sheetWriteHandlers,
                                                        CellWriteHandler[] cellWriteHandlers){

        ExcelWriterSheetBuilder excelWriterSheetBuilder = EasyExcel.write(outputStream, clazz)
                .inMemory(true)
                .registerWriteHandler(sheetWriteHandlers)
                .sheet(sheetName);
        if (null != cellWriteHandlers && cellWriteHandlers.length > 0) {
            for (int i = 0; i < cellWriteHandlers.length; i++) {
                excelWriterSheetBuilder.registerWriteHandler(cellWriteHandlers[i]);
            }
        }
        excelWriterSheetBuilder.doWrite(dataList);
    }

    /**
     * @Desc excel导入，基础校验
     * @Author cshao
     * @Date 2022/4/7 17:33
     * @Return {@link }
     **/
    @SneakyThrows
    public static <T> List<ExcelCheckVO> NotNullAndRepeatCheck(List<T> entityList, Class<T> beanClass) {
        List<ExcelCheckVO> checkOutputs = new ArrayList<>();
        // 1、数据空校验
        if (CollectionUtils.isEmpty(entityList)) {
            ExcelCheckVO output = new ExcelCheckVO();
            output.setExcelRow(-1);
            output.setExcelCol(-1);
            output.setErrorMsg("模板中未检测到数据！");
            checkOutputs.add(output);
            return checkOutputs;
        }

        PropertyDescriptor[] pds = Introspector.getBeanInfo(beanClass).getPropertyDescriptors();
        AtomicInteger row = new AtomicInteger(1);
        // 2、模板内重复
        Map<String, Integer> exRepeatMap = new HashMap<>();
        entityList.forEach(entity -> {
            row.incrementAndGet();
            for (PropertyDescriptor pd : pds) {
                String pdName = pd.getName();
                if (!pdName.equals("class")) {
                    try {
                        Field field = beanClass.getDeclaredField(pdName);
                        if (null != field && field.isAnnotationPresent(ExcelProperty.class)) {
                            // 2、字段非空性校验
                            if (field.isAnnotationPresent(NotNullAndEmpty.class)
                                    && null == pd.getReadMethod().invoke(entity)) {
                                ExcelCheckVO output = new ExcelCheckVO();
                                output.setExcelRow(row.get());
                                output.setExcelCol(field.getAnnotation(ExcelProperty.class).index() + 1);
                                output.setErrorMsg(field.getAnnotation(NotNullAndEmpty.class).message());
                                checkOutputs.add(output);
                            }
                            // 3、模板内数据重复性校验
                            Object fieldValue = null;
                            if (field.isAnnotationPresent(Id.class)
                                    && null != (fieldValue = pd.getReadMethod().invoke(entity))) {
                                String key = field.getName() + fieldValue;
                                Integer col = field.getAnnotation(ExcelProperty.class).index() + 1;
                                if (exRepeatMap.containsKey(key)) {
                                    ExcelCheckVO output = new ExcelCheckVO();
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
