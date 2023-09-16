package com.oauth2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @PostMapping("/register")
    public ResponseEntity<Object> registerClient(){
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
