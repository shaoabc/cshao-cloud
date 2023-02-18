package cn.cshao.user.dto;

import cs.cshao.common.utils.string.StringUtils;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Desc 分页查询参数基类
 * @Author cshao
 * @Date 2022/11/8 11:18
 **/
@Data
public class QueryPageDTO implements Serializable {
    private static final long serialVersionUID = -796814449209200601L;

    private static final int MIN_PAGE_SIZE = 10;
    private static final int MIN_PAGE_NUM = 1;


    @ApiModelProperty(value = "每页显示条数,默认10", required = true)
    private int pageSize = 10;

    @ApiModelProperty(value = "当前页码,默认1", required = true)
    private int pageNum = 1;

    @ApiModelProperty(value = "排序字段,默认创建时间")
    private String sort = "createTime";

    @ApiModelProperty(value = "排序方式,默认倒序")
    private String order = "DESC";

    public QueryPageDTO() {
    }

    /**
     * 分页构造函数
     *
     * @param pageNum  当前页
     * @param pageSize 每页显示条数
     */
    public QueryPageDTO(int pageNum, int pageSize) {
        if (pageNum > MIN_PAGE_NUM) {
            this.pageNum = pageNum;
        }
        if (pageSize > MIN_PAGE_SIZE) {
            this.pageSize = pageSize;
        }
    }

    /**
     * 分页构造函数
     *
     * @param pageNum  当前页
     * @param pageSize 每页显示条数
     * @param order    排序方式
     * @param sort     排序字段
     */
    public QueryPageDTO(int pageNum, int pageSize, String sort, String order) {
        this(pageNum, pageSize);
        if (StringUtils.isNotBlank(sort)) {
            this.sort = sort;
        }
        if (StringUtils.isNotBlank(order)) {
            this.order = order;
        }
    }
}
