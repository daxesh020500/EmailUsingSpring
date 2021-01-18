package com.example.emaildemo.controller;

import com.example.emaildemo.services.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "email")
public class SendEmailController {

    @Autowired
    SendEmailService sendEmailService;

    @RequestMapping(value = "/sendemail")
    public String sendMail(String recipient, String subject, String body) {
        sendEmailService.sendMail(recipient,subject,body);
        return "Email sent successfully";
    }
}
