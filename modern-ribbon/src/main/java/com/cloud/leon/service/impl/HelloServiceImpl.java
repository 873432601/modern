package com.cloud.leon.service.impl;

import com.cloud.leon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 蔡学亮(caixueliang@shoujinwang.com)
 * @date 2018年01月12日 17:17
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

}
