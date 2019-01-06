package com.oranfish.jarslink_provider.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.oranfish.jarslink_api.service.HelloService;
import org.springframework.stereotype.Service;

@SofaService(uniqueId = "helloService")
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String message() {
        return "hello 2";
    }
}
