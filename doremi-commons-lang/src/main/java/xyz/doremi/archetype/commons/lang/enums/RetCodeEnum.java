package xyz.doremi.archetype.commons.lang.enums;

/**
 * 通用枚举状态
 *
 * @author doremi
 * @date 2022-6月-28, 周二
 */
public enum RetCodeEnum {

    /**
     * 基础服务返回码枚举
     */
    success(0, "请求成功"),

    paramError(-1, "参数错误"),

    systemError(-999, "服务器异常"),

    ;

    private final int code;

    private final String msg;

    RetCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
