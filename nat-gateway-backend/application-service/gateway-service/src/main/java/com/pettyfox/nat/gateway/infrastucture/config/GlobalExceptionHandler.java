package com.pettyfox.nat.gateway.infrastucture.config;

import com.pettyfox.nat.gateway.infrastucture.basic.RestObjectResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Petty Fox
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public RestObjectResponse<?> exceptionHandler(Exception e) {
        return RestObjectResponse.err(e);
    }
}