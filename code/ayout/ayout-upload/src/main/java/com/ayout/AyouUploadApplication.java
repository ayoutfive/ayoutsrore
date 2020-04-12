package com.ayout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AyouUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyouUploadApplication.class, args);
    }
}