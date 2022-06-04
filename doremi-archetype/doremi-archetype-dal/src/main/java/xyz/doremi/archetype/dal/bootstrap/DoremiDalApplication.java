package xyz.doremi.archetype.dal.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Spring启动入口程序
 *
 * @author doremi
 */
@SpringBootApplication(scanBasePackages = "xyz.doremi.archetype")
public class DoremiDalApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DoremiDalApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DoremiDalApplication.class);
    }

}
