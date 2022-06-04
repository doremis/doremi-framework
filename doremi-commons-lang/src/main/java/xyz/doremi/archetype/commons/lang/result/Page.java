package xyz.doremi.archetype.commons.lang.result;

import java.io.Serializable;

/**
 * 分页参数
 *
 * @author doremi
 * @date 2022-6月-28, 周二
 */
public final class Page implements Serializable {

    private boolean resolved;

    /**
     * 页码
     */
    private int page = 1;

    /**
     * 分页大小 [10,20,50,100]
     */
    private int size = 10;

    /**
     * 开始索引位置
     */
    private int start;

    /**
     * 结束索引位置
     */
    private int end;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
        this.resolve();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        this.resolve();
    }

    public int getStart() {
        if (!resolved) {
            this.resolve();
        }
        return start;
    }

    public int getEnd() {
        if (!resolved) {
            this.resolve();
        }
        return end;
    }

    public Page() { }

    public Page(int page, int size) {
        this.page = page;
        this.size = size;
        this.resolve();
    }

    @Override
    public String toString() {
        return "Page{" +
                "resolved=" + resolved +
                ", page=" + page +
                ", size=" + size +
                ", start=" + start +
                ", end=" + end +
                '}';
    }

    private void resolve() {
        if (page <= 0) {
            page = 1;
        }
        if (size <= 0) {
            size = 10;
        }
        start = (page - 1) * size;
        end = page * size;
        resolved = true;
    }
}
