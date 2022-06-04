package xyz.doremi.archetype.commons.lang.util;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

/**
 * Trace 工具
 *
 * @author doremi
 * @date 2022-6月-28, 周二
 */
public class FormatUtil {

    /**
     * 提供一个format的工具，具体使用的slf4j的实现方式
     *
     * @param format format message
     * @param args   参数
     * @return 格式化后的消息
     */
    public static String format(String format, Object... args) {
        if (ArrayUtils.isEmpty(args)) {
            return format;
        }
        FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format
                , Arrays.stream(args).map(FormatUtil::tryToString).toArray());
        return formattingTuple.getMessage() + "\n"
                + FormatUtil.extractTrace(formattingTuple.getThrowable());
    }

    /**
     * 抽取异常栈信息
     *
     * @param e 异常对象
     * @return 异常栈信息，不超过5000字符
     */
    public static String extractTrace(Throwable e) {
        return extractTrace(e, 5000);
    }

    /**
     * 抽取异常栈信息
     *
     * @param e         异常对象
     * @param maxLength 抽取最大长度
     * @return 异常栈信息，不超过5000字符
     */
    public static String extractTrace(Throwable e, int maxLength) {
        if (e == null || maxLength < 3) {
            return StringUtils.EMPTY;
        }
        String errorStack;
        StringWriter stringWriter = new StringWriter();
        try (PrintWriter printWriter = new PrintWriter(stringWriter)) {
            e.printStackTrace(printWriter);
            errorStack = stringWriter.toString();
        }
        int length = StringUtils.length(errorStack);
        if (length <= 0) {
            errorStack = StringUtils.EMPTY;
        } else if (length >= maxLength) {
            errorStack = errorStack.substring(0, maxLength - 3) + "...";
        }
        return errorStack;
    }

    private static Object tryToString(Object arg) {
        if (arg == null) {
            return "null";
        }
        if (arg instanceof String
                || arg instanceof Number
                || arg instanceof Boolean
                || arg instanceof Character
                || arg instanceof Throwable) {
            return arg;
        }
        return JSON.toJSONString(arg);
    }
}
