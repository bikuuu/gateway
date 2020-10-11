package com.biku.parcellocker.profilBeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("prod")
@Profile("!dev")
public class HelloFromProd implements SayHello{

    @Override
    public String hello() {
        return "HELLO FROM PRODUCTION COMPONENT";
    }
}
