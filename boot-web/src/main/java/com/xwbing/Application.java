package com.xwbing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 项目名称: boot-module-demo
 * 创建时间: 2017/11/2 18:19
 * 作者: boot-module-demo
 * 说明: 启动类
 */
@SpringBootApplication
//@Configuration 定义为配置类,相当于xml文件中的<beans></beans>
//@ComponentScan 组件扫描
//@EnableAutoConfiguration 借助@Import的帮助,将所有符合自动配置条件的bean定义加载到IoC容器
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
