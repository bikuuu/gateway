package com.biku.parcellocker.profilBeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class HelloFromDev implements SayHello{
    @Override
    public String hello() {
        return "HELLO FROM DEV COMPONENT";
    }
}
