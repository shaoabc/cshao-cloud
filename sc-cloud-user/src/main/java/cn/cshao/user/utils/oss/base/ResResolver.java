package cn.cshao.user.utils.oss.base;


import cn.cshao.user.utils.oss.entity.ResourceURI;

import java.util.List;

public interface ResResolver {

    ResourceURI getResourceURI(String resNo);

    List<ResourceURI> getResURIList(String srcNo);

    Boolean saveOrUpdateResList(List<String> orderedResNoList, String srcNo);

    int deleteResBySrcNo(String srcNo);

    int deleteResBySrcNoList(List<String> srcNoList);

}
