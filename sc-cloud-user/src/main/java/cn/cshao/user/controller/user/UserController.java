package cn.cshao.user.controller.user;

import cn.cshao.user.dto.agent.AgentInput;
import cn.cshao.user.dto.excel.ExportAgentListModel;
import cn.cshao.user.service.user.UserService;
import com.alibaba.excel.EasyExcel;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.net.URLEncoder;
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
    @ApiOperation(value = "3.导出CRC信息Excel")
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

//        @ApiOperationSupport(order = 2)
//        @ApiOperation(value = "6.生成pdf")
//        @RequestMapping(value = "/generateAgentPdf", method = RequestMethod.POST)
//        public ResourceURI generateAgentPdf(@RequestBody @Valid AgentInput input)  throws Exception {
//            return this.userService.generateAgentPdf(input);
//        }



}
