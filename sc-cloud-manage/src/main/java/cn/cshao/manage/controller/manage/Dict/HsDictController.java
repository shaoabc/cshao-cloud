package cn.cshao.manage.controller.manage.Dict;

import cn.cshao.manage.dto.manage.DictDTO;
import cn.cshao.manage.service.HsDictService;
import cn.cshao.manage.vo.manage.HsDictVO;
import com.github.pagehelper.PageInfo;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
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

import javax.validation.Valid;

/**
 * @author cshao
 * @desc   manage --后台端字典数据
 * @company
 * @create 2023-02-18 2:55 下午
 */
@Api(value = "manage", tags = "后台端")
@ApiSort(value = 2)
@Slf4j
@Validated
@RequestMapping("/api/manage")
@AllArgsConstructor
@RestController
public class HsDictController {
     @Autowired
     private HsDictService hsDictService;

    @ApiOperation(value = "1.分页获取医院字典")
    @ApiOperationSupport(order = 1)
    @PostMapping(value = "/queryHospitalPageList")
    public PageInfo<HsDictVO> queryHospitalPageList(@RequestBody @Valid DictDTO dto) {
        return this.hsDictService.queryHospitalPageList(dto);
    }
    @ApiOperation(value = "2.分页获取地区字典")
    @ApiOperationSupport(order = 2)
    @PostMapping(value = "/queryDistrictPageList")
    public PageInfo<HsDictVO> queryDistrictPageList(@RequestBody @Valid DictDTO dto) {
        return this.hsDictService.queryDistrictPageList(dto);
    }
}
