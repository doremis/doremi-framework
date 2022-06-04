package xyz.doremi.archetype.commons.lang.result;


import xyz.doremi.archetype.commons.lang.enums.RetCodeEnum;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Map数据对象
 *
 * @author doremi
 * @date 2022-6月-28, 周二
 */
public class MapResult extends DataResult<Map<String, Object>> implements Serializable {

    public static MapResult mapOk() {
        return new MapResult(RetCodeEnum.success);
    }

    public static MapResult mapOk(Map<String, Object> map) {
        return new MapResult(RetCodeEnum.success, map);
    }

    public static MapResult mapOk(String message, Map<String, Object> map) {
        return new MapResult(RetCodeEnum.success, message, map);
    }

    public static MapResult mapFailed(RetCodeEnum retCodeEnum) {
        return new MapResult(retCodeEnum);
    }

    public static MapResult mapFailed(RetCodeEnum retCodeEnum, String message) {
        return new MapResult(retCodeEnum, message, null);
    }

    MapResult(RetCodeEnum retCodeEnum) {
        super(retCodeEnum);
    }

    MapResult(RetCodeEnum retCodeEnum, Map<String, Object> map) {
        super(retCodeEnum, map);
    }

    MapResult(RetCodeEnum retCodeEnum, String msg, Map<String, Object> map) {
        super(retCodeEnum, msg, map);
    }

    MapResult(Map<String, Object> map) {
        super(map);
    }

    public MapResult addItem(String key, Object value) {
        Map<String, Object> data = this.getData();
        if (data == null) {
            data = new HashMap<>(8);
        }
        data.put(key, value);
        return this;
    }
}
