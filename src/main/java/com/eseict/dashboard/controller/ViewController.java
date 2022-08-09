package com.eseict.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ViewController {
    @GetMapping(value="/api/hello")
    public Date getMainView(){
        return new Date();
    }
}