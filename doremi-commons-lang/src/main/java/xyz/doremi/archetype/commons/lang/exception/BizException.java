package xyz.doremi.archetype.commons.lang.exception;

import xyz.doremi.archetype.commons.lang.enums.RetCodeEnum;

/**
 * 自定义业务异常
 *
 * @author doremi
 * @date 2022-6月-28, 周二
 */
public class BizException extends RuntimeException {

    private int code = RetCodeEnum.systemError.getCode();

    public BizException(String message) {
        super(message);
    }

    public BizException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
