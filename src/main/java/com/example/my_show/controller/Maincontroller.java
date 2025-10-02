package com.example.my_show.controller;

import com.example.my_show.dto.Registerdto;
import com.example.my_show.service.Mainservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class Maincontroller {

    @Autowired
    private Mainservice mainservice;

    // register mapping
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Registerdto registerdto){
        String data = mainservice.registers(registerdto);
        return ResponseEntity.ok(data);
    }

    // login mapping
    @PostMapping("/login")
    public ResponseEntity<Map<String ,Object>> login(@RequestBody Registerdto registerdto){
        String data = mainservice.logins(registerdto);
        Map<String ,Object> dats = new HashMap<>();
        dats.put("token" ,data);
        return ResponseEntity.ok(dats);
    }

}
