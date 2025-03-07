package com.demo.service;

import com.demo.entity.Bus;
import com.demo.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public void saveBus(Bus bus) {
        busRepository.save(bus);
    }
}
