package com.example.eureka.hystrix;

import com.example.eureka.remote.HelloRemote;
import org.springframework.stereotype.Component;

@Component("helloRemote")
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "hello" + name + ", this message send faild";
    }
}
