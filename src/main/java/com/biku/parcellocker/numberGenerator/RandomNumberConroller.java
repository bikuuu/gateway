package com.biku.parcellocker.numberGenerator;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class RandomNumberConroller {
    private final SingletonShipingBoxNumberGenerator singletonShipingBoxNumberGenerator;
    private final RequestShipingBoxNumberGenerator requestShipingBoxNumberGenerator;

    @GetMapping("random")
    public int generateRandom() {
        return singletonShipingBoxNumberGenerator.getRandomNumber();
    }

    @GetMapping("requestrandom")
    public int generateRequestNumber() {
        return requestShipingBoxNumberGenerator
                .getRandomNumber();
    }
}
