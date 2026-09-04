package com.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


    @GetMapping("/getPaymentMessage")
    public String message() {
         return "Payment Service is running - Version 3 deploy in AWS";
    }
}
