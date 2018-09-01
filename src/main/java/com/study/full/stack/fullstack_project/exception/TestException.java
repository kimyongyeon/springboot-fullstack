package com.study.full.stack.fullstack_project.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestException extends RuntimeException{
    private String message;

}
