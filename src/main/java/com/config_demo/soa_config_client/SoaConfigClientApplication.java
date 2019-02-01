package com.config_demo.soa_config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SoaConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoaConfigClientApplication.class, args);
    }

}

//如果profile的值是 dev, 启动后请访问： http://localhost:7777/from
//如果profile的值是 prod, 启动后请访问：http://localhost:7950/from