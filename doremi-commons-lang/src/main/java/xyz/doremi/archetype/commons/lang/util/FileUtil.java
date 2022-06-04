package xyz.doremi.archetype.commons.lang.util;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 文件操作工具类
 *
 * @author doremi
 * @date 2022-6月-28, 周二
 */
public class FileUtil {

    public static Path classpath(String path) {
        try {
            URL resource = Thread.currentThread().getContextClassLoader().getResource(path);
            if (resource == null) {
                resource = FileUtil.class.getClassLoader().getResource(path);
            }
            if (resource == null) {
                return null;
            }
            return Paths.get(resource.toURI());
        } catch (URISyntaxException e) {
            return null;
        }
    }


}
