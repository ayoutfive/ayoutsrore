package com.ayout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/10/010 00:01
 * @Description: ayout
 * @Version: 0.0.1
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ayout.item.mapper")
public class AyoutItemApplication {


    public static void main(String[] args) {
        SpringApplication.run(AyoutItemApplication.class);
    }


}
