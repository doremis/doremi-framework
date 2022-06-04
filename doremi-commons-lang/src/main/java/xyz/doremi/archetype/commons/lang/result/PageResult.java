package xyz.doremi.archetype.commons.lang.result;

import xyz.doremi.archetype.commons.lang.enums.RetCodeEnum;

import java.io.Serializable;

/**
 * 分页数据对象
 *
 * @author doremi
 * @date 2022-6月-28, 周二
 */
public class PageResult<E> extends DataResult<Pager<E>> implements Serializable {

    public static <E> PageResult<E> pageOk() {
        return new PageResult<>(RetCodeEnum.success);
    }

    public static <E> PageResult<E> pageOk(Pager<E> page) {
        return new PageResult<>(RetCodeEnum.success, page);
    }

    public static <E> PageResult<E> pageOk(String message, Pager<E> page) {
        return new PageResult<>(RetCodeEnum.success, message, page);
    }

    public static <E> PageResult<E> pageFailed(RetCodeEnum retCodeEnum) {
        return new PageResult<>(retCodeEnum);
    }

    public static <E> PageResult<E> pageFailed(RetCodeEnum retCodeEnum, String message) {
        return new PageResult<>(retCodeEnum, message, null);
    }

    PageResult(RetCodeEnum retCodeEnum) {
        super(retCodeEnum);
    }

    PageResult(RetCodeEnum retCodeEnum, Pager<E> page) {
        super(retCodeEnum, page);
    }

    PageResult(RetCodeEnum retCodeEnum, String msg, Pager<E> page) {
        super(retCodeEnum, msg, page);
    }

    PageResult(Pager<E> page) {
        super(page);
    }
}
