package com.basedatos.basededatos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(value = "/")
    public String HolaMundo(){
        return "Holamundo";
    }
}
