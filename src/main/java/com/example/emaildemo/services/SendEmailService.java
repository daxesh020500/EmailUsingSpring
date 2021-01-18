package com.example.emaildemo.services;

public interface SendEmailService  {
    void sendMail(String recipient, String subject, String body);
}
