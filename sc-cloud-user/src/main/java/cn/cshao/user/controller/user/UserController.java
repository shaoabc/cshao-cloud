package cn.cshao.user.controller.user;

import cn.cshao.user.dto.agent.AgentInput;
import cn.cshao.user.dto.excel.ExportAgentListModel;
import cn.cshao.user.service.user.UserService;
import com.alibaba.excel.EasyExcel;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import cs.cshao.common.excel.ExcelCheckVO;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cshao
 * @desc   poi 操作生产 excel /pdf
 * @company
 * @create 2023-03-02 2:06 下午
 */
@RestController
@Slf4j
@Validated
@RequestMapping("/api/user")
@AllArgsConstructor
@ApiSort(value = 2)
public class UserController {
      private final UserService userService;
    @ApiOperationSupport(order = 1)
    @ApiOperation(value = "下载模板")
    @PostMapping(value = "/exportTemplate")
    public void exportStockTemplate(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        String fileName = URLEncoder.encode("用户信息" + System.currentTimeMillis(), "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), ExportAgentListModel.class).sheet("用户信息").doWrite(new ArrayList());
    }

    @ApiOperationSupport(order = 3)
    @ApiOperation(value = "excel数据导入错误信息返回")
    @PostMapping(value = "/checkImport")
    public List<ExcelCheckVO> checkImport(@NotNull(message = "文件不能为空") MultipartFile file) {
        return this.userService.checkImport(file);
    }



    @ApiOperationSupport(order = 4)
    @ApiOperation(value = "4.导出用户信息Excel")
    @PostMapping("/queryAgentInfoListExcel")
    public void exportCrcList(@RequestBody @Valid AgentInput input, HttpServletResponse response) throws IOException {
        List<ExportAgentListModel> agentList = userService.exportDoctorList(input);;
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("志愿者列表" + System.currentTimeMillis(), "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), ExportAgentListModel.class).sheet("志愿者列表").doWrite(agentList);
    }

//        @ApiOperationSupport(order = 5)
//        @ApiOperation(value = "5.生成pdf")
//        @RequestMapping(value = "/generateAgentPdf", method = RequestMethod.POST)
//        public ResourceURI generateAgentPdf(@RequestBody @Valid AgentInput input)  throws Exception {
//            return this.userService.generateAgentPdf(input);
//        }



}
