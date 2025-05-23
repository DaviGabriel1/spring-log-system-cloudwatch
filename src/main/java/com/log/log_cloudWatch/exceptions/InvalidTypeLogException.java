package com.log.log_cloudWatch.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidTypeLogException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidTypeLogException(String message) {
        super(message);
    }
}
