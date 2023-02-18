package cn.cshao.user.controller.agent;

import cn.cshao.user.dto.AgentDTO;
import cn.cshao.user.service.agent.AgentApplyService;
import cn.cshao.user.vo.agent.AgentInfoVO;
import com.github.pagehelper.PageInfo;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-18 4:49 下午
 */
@Api(value = "agent", tags = "志愿者")
@ApiSort(value = 1)
@Slf4j
@Validated
@RequestMapping("/api/agent")
@AllArgsConstructor
@RestController
public class AgentApplyController {

    @Resource
    private AgentApplyService agentApplyService;

    @ApiOperation(value = "1.分页获取志愿者信息")
    @ApiOperationSupport(order = 1)
    @PostMapping(value = "/queryAgentPageList")
    public PageInfo<AgentInfoVO> queryAgentPageList(@RequestBody @Valid AgentDTO dto) {
        return this.agentApplyService.queryAgentPageList(dto);
    }

    @ApiOperation(value = "2.获取指定医院的志愿者信息")
    @ApiOperationSupport(order = 2)
    @PostMapping(value = "/queryAgHpRelList")
    public PageInfo<AgentInfoVO> queryAgHpRelList(@RequestBody @Valid AgentDTO dto) {
        return this.agentApplyService.queryAgHpRelList(dto);
    }
}
