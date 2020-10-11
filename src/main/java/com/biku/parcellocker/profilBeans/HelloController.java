package com.biku.parcellocker.profilBeans;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final SayHello sayHello;

    @GetMapping("sayhello")
    public String sayHello() {
        return sayHello.hello();
    }
}
