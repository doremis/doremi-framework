# 简介

    Spring Boot 2.6.8 学习示例代码库

## 项目依赖

### 环境依赖

| 基础依赖             | 依赖版本           | 文档地址                                                                                                                                     |
|:-----------------|:---------------|:-----------------------------------------------------------------------------------------------------------------------------------------|
| Spring Boot      | 2.6.8          | [Spring Boot 文档](https://docs.spring.io/spring-boot/docs/2.6.8/reference/html/) ([版本维护](https://spring.io/projects/spring-boot#support)) |
| Spring Framework | 5.3.20.RELEASE | [Spring Framework 文档](https://docs.spring.io/spring-framework/docs/5.3.20/reference/html/)                                               |
| Maven            | 3.5+           | [Maven 官网](https://archive.apache.org/dist/maven/maven-3/)  [下载地址](https://archive.apache.org/dist/maven/maven-3/)                       |
| Tomcat           | 8.0+           | [Tomcat 8.0 文档](https://tomcat.apache.org/tomcat-8.0-doc/)                                                                               | 
| Servlet          | 3.1+           | [中文文档参考](https://www.iteye.com/blog/jinnianshilongnian-1912455)                                                                          | 
| JDK              | 1.8+           |                                                                                                                                          |

### 其他参考文档

[Spring Boot Maven 插件文档](https://docs.spring.io/spring-boot/docs/2.6.8/maven-plugin/reference/htmlsingle/)

## 维护规范

### 模块说明

```xml

<modules>
    <!--依赖模块：维护Spring以及公司中间件依赖版本-->
    <module>doremi-boot-dependencies</module>
    <!--公共模块：通用的传值对象-->
    <module>archetype-commons-lang</module>
    <!--公共模块：基于组件二次封装的工具等-->
    <module>archetype-commons-web</module>
    <!--自动配置：基于中间件实现的自动配置等-->
    <module>archetype-boot-autoconfigure</module>
    <!--公共依赖：新建工程都应该集成这个starter-->
    <!--公共依赖：SpringBoot的编译打包依赖的增强等-->
    <module>doremi-archetype-parent-starter</module>
    <!--公共依赖：新增Starter公共父模块-->
    <module>doremi-boot-starters</module>
    <!--骨架工程：骨架工程实现-->
    <module>doremi-archetype-parent</module>
</modules>

```




