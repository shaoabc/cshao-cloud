package cn.cshao.manage.controller.manage;

import cn.cshao.manage.dto.manage.ItemDTO;
import cn.cshao.manage.service.SwaggerService;
import cn.cshao.manage.vo.CommonItemVO;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSort;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import cs.cshao.common.bean.RestResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author cshao
 * @desc   测试swagger （集成）
 * @company
 * @create 2023-02-18 12:01 上午
 */
@RestController
@Api(value = "manage", tags = "后台端")
@Slf4j
@Validated
@RequestMapping("/api/manage")
@AllArgsConstructor
@ApiSort(value = 1)
public class SwaggerController {

    @Resource
    private SwaggerService swaggerService;

    @ApiOperation(value = "1.集成swagger")
    @ApiOperationSupport(order = 1)
    @PostMapping(value = "/queryCommonItemPageList")
    public RestResult<CommonItemVO> queryCommonItemPageList(@RequestBody @Valid ItemDTO dto) {
        return RestResult.success(this.swaggerService.queryCommonItemPageList(dto));
    }
}
