package com.example.securitymasterdemo.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalErrorController {

    @ExceptionHandler({Exception.class})
    public String handleException(HttpClientErrorException.Forbidden ex, Model model){
        System.out.println("Hello");
        System.out.println(ex.getClass().getSimpleName());
        model.addAttribute("message",ex.getMessage());
        return "error";
    }
}
