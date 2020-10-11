package com.biku.parcellocker.redirect;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class ParcelLockerController {

    @PostMapping("parcellocker")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendParcelLockerRequest(@RequestBody ParcelLocker parcelLocker) {
        Box box = new Box();
//        box.setBoxNumber(parcelLocker.getShippingBoxNumber());
        box.setBoxNumber("hohoho merry christmas");
        box.setStateOpen(parcelLocker.isStateOpen());
        log.info("opening box: {}", box);


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Box> boxResponseEntity = restTemplate.postForEntity(
                "http://nolocalhost:8088/api/parcellocker/changestate",
                box,
                Box.class);

        Box bodyFromClient = boxResponseEntity.getBody();
        if (boxResponseEntity.getStatusCode().is2xxSuccessful()) {
            log.error("opening completed: {}", bodyFromClient);
        }
    }

    @ExceptionHandler(HttpClientErrorException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ApiError HttpClientErrorHandler(HttpClientErrorException exception) {
        ApiError apiError = new ApiError();
        apiError.setLocalDateTime(LocalDateTime.now());
        apiError.setMessage(exception.getMessage());
//        apiError.setCasue(exception.getCause().getMessage());

        return apiError;
    }
}
