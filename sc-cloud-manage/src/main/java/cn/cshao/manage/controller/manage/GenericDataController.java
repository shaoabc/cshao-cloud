package cn.cshao.manage.controller.manage;

import cn.cshao.common.model.hsdb.HsDistrict;
import cn.cshao.manage.service.GenericDataService;
import cn.cshao.manage.vo.data.HospIdMapVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Desc 通用数据接口
 * @Author cshao
 * @Date 2022/12/19 11:10
 * @Return {@link }
 **/
@RestController
@Api(value = "GcData", tags = "通用数据接口")
@Slf4j
@Validated
@RequestMapping("/cloud/api/gc")
public class GenericDataController {

    @Resource
    private GenericDataService dataService;

    @ApiOperation(value = "1.获取全部行政区划")
    @RequestMapping("/pullDistrict")
    public List<HsDistrict> pullDistrict() {
        return this.dataService.pullDistrict();
    }

    @ApiOperation(value = "2.分页条件获取医院列表")
    @RequestMapping("/pullMapHospital")
    public Map<String, HospIdMapVO> pullMapHospital() {
        return this.dataService.pullMapHospital();
    }


}
