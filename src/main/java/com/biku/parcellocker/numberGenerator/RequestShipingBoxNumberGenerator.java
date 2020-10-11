package com.biku.parcellocker.numberGenerator;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Component
@RequestScope
public class RequestShipingBoxNumberGenerator {
    private int randomNumber;

    public RequestShipingBoxNumberGenerator() {
        Random random = new Random();
        randomNumber = random.nextInt(9);
    }

    public int getRandomNumber() {
        return randomNumber;
    }

}

