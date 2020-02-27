package com.kitafinder.demo.controller;

import com.kitafinder.demo.domain.Family;
import com.kitafinder.demo.repository.FamilyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyFinder {

    @Autowired
    FamilyRepository familyRepository;

    @GetMapping("/findAllFamilies")
    public Iterable<Family> findAllFamilies() {

        return familyRepository.findAll();
    }
}