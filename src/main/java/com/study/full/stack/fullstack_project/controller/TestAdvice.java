package com.study.full.stack.fullstack_project.controller;

import com.study.full.stack.fullstack_project.dto.ErrorMessage;
import com.study.full.stack.fullstack_project.exception.TestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class TestAdvice {
    @ExceptionHandler(value= {TestException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    protected ErrorMessage handlerConflict(RuntimeException ex, WebRequest request) {
        ErrorMessage em = new ErrorMessage();
        em.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
        em.setMessage(ex.getMessage());
        return em;
    }
}
