package com.cloud.leon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 *
 * @author 蔡学亮(caixueliang@shoujinwang.com)
 * @date 2018年01月10日 16:51
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplicaion {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplicaion.class, args);
    }
}
