package com.demo.controller;

import com.demo.entity.Bus;
import com.demo.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/j2/bus")
public class BusController {

    @Autowired
    private BusService busService;

    @PostMapping
    public ResponseEntity<String> addBus(
            @RequestBody Bus bus
    ){
        busService.saveBus(bus);
        return new ResponseEntity<>("saved", HttpStatus.CREATED);
    }
}
