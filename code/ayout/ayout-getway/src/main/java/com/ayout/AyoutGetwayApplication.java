package com.ayout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/9/009 23:44
 * @Description: ayout
 * @Version: 0.0.1
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class AyoutGetwayApplication {

    public static void main(String[] args) {



        SpringApplication.run(AyoutGetwayApplication.class, args);
    }
}
