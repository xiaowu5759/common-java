package com.xiaowu5759.common.query;

/**
 * @author xiaowu5759
 * @since 2021/8/8 12:13
 */
public class PageQuery {

    /**
     * 请求页码
     */
    private Integer pageNum;

    /**
     * 请求页面大小
     */
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
