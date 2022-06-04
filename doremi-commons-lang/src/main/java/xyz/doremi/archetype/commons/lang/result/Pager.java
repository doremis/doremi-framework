package xyz.doremi.archetype.commons.lang.result;

import java.io.Serializable;
import java.util.List;

/**
 * 分页数据返回
 *
 * @author doremi
 * @date 2022-6月-28, 周二
 */
public class Pager<E> implements Serializable {

    /**
     * 总数量
     */
    private int total;

    /**
     * 分页数据
     */
    private List<E> list;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }
}
