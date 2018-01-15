package com.cloud.leon.controller;

import com.cloud.leon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 蔡学亮(caixueliang@shoujinwang.com)
 * @date 2018年01月12日 17:18
 */
@RestController
public class HelloControler {
    @Autowired
    private HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

}
