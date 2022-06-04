package xyz.doremi.archetype.commons.lang.result;

import xyz.doremi.archetype.commons.lang.enums.RetCodeEnum;

import java.io.Serializable;

/**
 * 带有数据返回
 *
 * @author doremi
 * @date 2022-6月-28, 周二
 */
public class DataResult<T> extends Result implements Serializable {

    public static <T> DataResult<T> dataOk() {
        return new DataResult<>(RetCodeEnum.success);
    }

    public static <T> DataResult<T> dataOk(T data) {
        return new DataResult<>(RetCodeEnum.success, data);
    }

    public static <T> DataResult<T> dataOk(String message, T data) {
        return new DataResult<>(RetCodeEnum.success, message, data);
    }

    public static <T> DataResult<T> dataFailed(RetCodeEnum retCodeEnum) {
        return new DataResult<>(retCodeEnum);
    }

    public static <T> DataResult<T> dataFailed(RetCodeEnum retCodeEnum, String message) {
        return new DataResult<T>(retCodeEnum, message, null);
    }

    DataResult(RetCodeEnum retCodeEnum) {
        super(retCodeEnum);
    }

    DataResult(RetCodeEnum retCodeEnum, T data) {
        this(retCodeEnum);
        this.data = data;
    }

    DataResult(RetCodeEnum retCodeEnum, String msg, T data) {
        this(retCodeEnum, data);
        this.msg = msg;
    }

    DataResult(T data) {
        this(RetCodeEnum.success, data);
    }

    /**
     * 返回数据
     */
    protected T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataResult{" +
                "data=" + data +
                ", success=" + success +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
