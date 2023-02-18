package cn.cshao.user.feign;

import cn.cshao.common.model.hsdb.HsDistrict;
import cn.cshao.user.vo.data.HospIdMapVO;
import cs.cshao.common.bean.RestResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @Desc: 通用数据服务
 * @Author: cshao
 * @Date: 2022/8/7 19:47
 **/
@FeignClient(value = "cd-manage")
public interface IGenericDataFeign {

    @RequestMapping(value = "/cloud/api/gc/pullDistrict",method = RequestMethod.POST)
    List<HsDistrict> pullDistrict();

    @RequestMapping(value ="/cloud/api/gc/pullMapHospital"  ,method = RequestMethod.POST)
    RestResult<Map<String, HospIdMapVO>> pullMapHospital();
}