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

/**
 * M8: SpringCloud Config，设置配置中心（如soa_config_server项目），指定Git仓库；而服务客户端（如本项目soa_config_client）则可以发现前述的配置中心服务，能够从Git仓库获取远程配置，并在此配置下运行
 *
 */
//M8：如果profile的值是 dev, 则从远程config-repo仓库中拿出 dev 版本的配置文件,端口是7777， 启动后请访问： http://localhost:7777/from
//M8：如果profile的值是 prod，则从远程config-repo仓库中拿出 prod 版本的配置文件,端口是7950， 启动后请访问：http://localhost:7950/from

/**
 * M9：SpringCloud Config整合SpringCloud Bus，实时更新总线上的属性配置
 */

//M9：增设Spring Cloud Bus，实时更新配置变更，请在cmd发送 curl -v -X POST "http://localhost:7950/actuator/bus-refresh" 请求，则配置更新即可发送到消息队列，本客户端将会得到新的配置