package com.itcast;

import com.itcast.controller.Hello2Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/6/006 21:12
 * @Description: 引导类 程序的入口
 * @Version: 0.0.1
 *
 * @EnableAutoConfiguration
 * @ComponentScan //扫描该类所在的包
 * @Configuration
 * @SpringBootApplication//相当于EnableAutoConfiguration+ComponentScan+Configuration
 */
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);

    }

}
