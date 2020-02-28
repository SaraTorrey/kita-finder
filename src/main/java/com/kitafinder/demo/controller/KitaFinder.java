package com.kitafinder.demo.controller;

import com.kitafinder.demo.domain.Kita;
import com.kitafinder.demo.repository.KitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KitaFinder {

    @Autowired
    KitaRepository kitaRepository;


    @GetMapping( "/findAllKitas" )
    public Iterable<Kita> findAllKitas() {

        return kitaRepository.findAll();
    }
}