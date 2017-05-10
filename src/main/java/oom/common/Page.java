package oom.common;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private long count;// 总条数
    private long pageSize;// 每页条数
    private long pageNo;
    private List<T> data;
    private Object other;

    private long pageCount;// 总页数-计算得来

    public Page(long count, long pageSize, long pageNo, List<T> data) {
        super();
        this.count = count;
        this.pageSize = pageSize;
        this.pageNo = pageNo;
        this.data = data;

        this.pageCount = count % pageSize == 0 ? count / pageSize : count
                / pageSize + 1;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getPageNo() {
        return pageNo;
    }

    public void setPageNo(long pageNo) {
        this.pageNo = pageNo;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getPageCount() {
        return pageCount;
    }

    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }

    public Object getOther() {
        return other;
    }

    public void setOther(Object other) {
        this.other = other;
    }
}
