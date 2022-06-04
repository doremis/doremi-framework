package xyz.doremi.archetype.commons.lang.result;

import xyz.doremi.archetype.commons.lang.enums.RetCodeEnum;

import java.io.Serializable;

/**
 * @author doremi
 */
public class Result implements Serializable {

    public static Result success() {
        return new Result(RetCodeEnum.success);
    }

    public static Result success(String message) {
        return new Result(RetCodeEnum.success, message);
    }

    public static Result failed(RetCodeEnum retCodeEnum) {
        return new Result(retCodeEnum);
    }

    public static Result failed(RetCodeEnum retCodeEnum, String message) {
        return new Result(retCodeEnum, message);
    }

    public static Result failed(int code, String message) {
        return new Result(RetCodeEnum.success.getCode() == code, code, message);
    }

    /**
     * 是否成功
     */
    protected boolean success;

    /**
     * 返回码
     */
    protected int code;

    /**
     * 返回信息
     */
    protected String msg;

    protected Result(boolean success, int code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    protected Result(RetCodeEnum retCodeEnum) {
        this(retCodeEnum, retCodeEnum.getMsg());
    }

    protected Result(RetCodeEnum retCodeEnum, String msg) {
        this(RetCodeEnum.success.equals(retCodeEnum), retCodeEnum.getCode(), msg);
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
