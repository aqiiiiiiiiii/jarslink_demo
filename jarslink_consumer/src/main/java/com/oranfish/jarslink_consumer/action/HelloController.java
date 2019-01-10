package com.oranfish.jarslink_consumer.action;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.oranfish.jarslink_api.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @SofaReference(uniqueId = "helloService")
    HelloService helloService;

    @GetMapping("/hello.do")
    public String hello(){

        System.out.println(123);
        return helloService.message();
    }
}
