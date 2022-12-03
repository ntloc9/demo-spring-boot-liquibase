package com.example.demoliquibase.controller;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("samples")
public class Sample {

    @GetMapping
    public HttpEntity<String> getSamples(){
        return new HttpEntity<>("OK");
    }
}
