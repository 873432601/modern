package com.cloud.leon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 蔡学亮(caixueliang@shoujinwang.com)
 * @date 2018年01月12日 15:41
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoController {
    public static void main(String[] args) {
        SpringApplication.run(DemoController.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
