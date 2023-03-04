package cn.cshao.user.service.user;

import cn.cshao.common.dao.slldb.SllAgentMapper;
import cn.cshao.common.model.slldb.SllAgent;
import cn.cshao.common.model.slldb.SllAgentExample;
import cn.cshao.user.dto.agent.AgentInput;
import cn.cshao.user.dto.excel.ExportAgentListModel;
import cs.cshao.common.utils.map.ModelMapUtils;
import cs.cshao.common.utils.string.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-03-02 2:07 下午
 */
@Service
@Slf4j
public class UserService {

    @Resource
    private SllAgentMapper sllAgentMapper;
    /**
     * 查询满足条件的人员
     * @param input
     * @return
     */
    public List<ExportAgentListModel> exportDoctorList(AgentInput input) {
        List<ExportAgentListModel> exportModelList =new ArrayList<>();
        SllAgentExample sllAgentExample =new SllAgentExample();
        sllAgentExample.setOrderByClause("ag_id");
        SllAgentExample.Criteria criteria =sllAgentExample.createCriteria();
        if(StringUtils.isNotBlank(input.getAgentNm())){
            criteria.andAgNmLike("%"+input.getAgentNm().trim()+"%");
        }
        if(null!=input.getAgId()){
            criteria.andAgIdEqualTo(input.getAgId());
        }
        List<SllAgent> agentList =sllAgentMapper.selectByExample(sllAgentExample);
        if(CollectionUtils.isNotEmpty(agentList)){
            exportModelList = ModelMapUtils.mapList(agentList,ExportAgentListModel.class) ;
        }
        return exportModelList;
    }
     // 生产pdf
//    public ResourceURI generateAgentPdf(AgentInput input) throws IOException {
//        // 获取系统tmp路径和resource资源模板文件
//        String sysTmpPath = System.getProperty("java.io.tmpdir")
//                + File.separator + "template" + File.separator;
//        ClassPathResource classPathResource = new ClassPathResource("template/adviceNoteTemplate.xlsx");
//        InputStream inputStream = classPathResource.getInputStream();
//        // 从jar包解压复制资源模板文件到服务器tmp目录下
//        String excelTempPath = sysTmpPath + "adviceNoteTemplate.xlsx";
//        log.info("付款通知书excel模板:" + excelTempPath);
//        File excelTempFile = new File(excelTempPath); // excel模板
//        try {
//            FileUtils.copyInputStreamToFile(inputStream, excelTempFile);
//        } finally {
//            IOUtils.closeQuietly(inputStream);
//        }
//        // 根据模板文件打印数据到模板上，并输出到tmp目录下
//        String excelPrintPath = sysTmpPath + "adviceNotePrinted.xlsx";
//        log.info("付款通知书excel打印:" + excelPrintPath);
//        File excelPrintFile = new File(excelPrintPath); // excel打印
//        OutputStream out = new FileOutputStream(excelPrintFile);
        // 核心取数逻辑
//        PaymentAdviceNoteDTO adviceNote = this.queryAndUpdateAdviceNote(input);
//        ExcelManageUtils.exportExcel(out, new ArrayList<>(), adviceNote, excelTempPath);
        // 凭借打印好的excel文件转换生成pdf打印文件
//        String pdfPrintPath = sysTmpPath + "adviceNotePrinted.pdf";
//        log.info("付款通知书pdf转换开始:" + pdfPrintPath);
//        Excel2PdfUtils.excel2pdf(excelPrintPath, pdfPrintPath);
//        log.info("付款通知书pdf转换结束:" + pdfPrintPath);
//        // 把生成的pdf文件上传到云库并返回给前端展示
//        log.info("付款通知书pdf上传开始");
//        Long resNo = this.client.fileUpload(new File(pdfPrintPath)
//                , ROOT_DIR, adviceNote.getPreSetlNo()
//                , (adviceNote.getStartTime() + "~" + adviceNote.getEndTime()));
//        log.info("付款通知书pdf上传结束");
//        String resURI = client.queryFile(resNo);
//        log.info("付款通知书pdf查询完成：" + resNo.toString());
//        return new ResourceURI(resNo.toString(), resURI, ".pdf");
//    }
}
