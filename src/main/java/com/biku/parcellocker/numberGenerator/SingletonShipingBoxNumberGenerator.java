package com.biku.parcellocker.numberGenerator;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SingletonShipingBoxNumberGenerator {
    private int randomNumber;

    public SingletonShipingBoxNumberGenerator() {
        Random random = new Random();
        randomNumber = random.nextInt(9);
    }

    public int getRandomNumber() {
        return randomNumber;
    }

}

