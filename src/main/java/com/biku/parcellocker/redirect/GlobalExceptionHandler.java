package com.biku.parcellocker.redirect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.ConnectException;
import java.time.LocalDateTime;

@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConnectException.class)
    //@ResponsBody
    public ApiError handlerServerError(ConnectException exception) {
        ApiError apiError = new ApiError();
        apiError.setLocalDateTime(LocalDateTime.now());
        apiError.setMessage(exception.getMessage());
        return apiError;
    }
}
