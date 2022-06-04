package xyz.doremi.archetype.commons.lang.result;

import xyz.doremi.archetype.commons.lang.enums.RetCodeEnum;

import java.io.Serializable;
import java.util.List;

/**
 * @author wanhuiyue
 * @date 2022-6月-28, 周二
 */
public class ListResult<E> extends DataResult<List<E>> implements Serializable {

    public static <E> ListResult<E> listOk() {
        return new ListResult<>(RetCodeEnum.success);
    }

    public static <E> ListResult<E> listOk(List<E> list) {
        return new ListResult<>(RetCodeEnum.success, list);
    }

    public static <E> ListResult<E> listOk(String message, List<E> list) {
        return new ListResult<E>(RetCodeEnum.success, message, list);
    }

    public static <E> ListResult<E> listFailed(RetCodeEnum retCodeEnum) {
        return new ListResult<E>(retCodeEnum);
    }

    public static <E> ListResult<E> listFailed(RetCodeEnum retCodeEnum, String message) {
        return new ListResult<E>(retCodeEnum, message, null);
    }

    ListResult(RetCodeEnum retCodeEnum){
        super(retCodeEnum);
    }

    ListResult(RetCodeEnum retCodeEnum, List<E> list) {
        super(retCodeEnum, list);
    }

    ListResult(RetCodeEnum retCodeEnum, String message, List<E> list) {
        super(retCodeEnum, message, list);
    }

    ListResult(List<E> list) {
        super(list);
    }
}
