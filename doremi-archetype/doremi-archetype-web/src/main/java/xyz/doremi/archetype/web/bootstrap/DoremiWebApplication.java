package xyz.doremi.archetype.web.bootstrap;

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
public class DoremiWebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        // jar启动入口，对于常规war启动来说不是必须的
        SpringApplication.run(DoremiWebApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DoremiWebApplication.class);
    }

}
