package com.biku.parcellocker.redirect;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiError {
    private LocalDateTime localDateTime;
    private String message;
    private String casue;
}
