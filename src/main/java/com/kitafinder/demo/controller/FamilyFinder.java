package com.kitafinder.demo.controller;

import com.kitafinder.demo.domain.Family;
import com.kitafinder.demo.repository.FamilyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyFinder {

    @Autowired
    FamilyRepository familyRepository;

    @GetMapping("/findAllFamilies")
    public Iterable<Family> findAllFamilies() {

        return familyRepository.findAll();
    }

    @GetMapping("/family/add/{name}")
    public Family findAllFamilies(@PathVariable String name) {

        Family family = new Family();
        family.name = name;

        return familyRepository.save( family );
    }

    @GetMapping("/family/add/{name}/{mother}")
    public Family findAllFamilies (@PathVariable String name, @PathVariable String mother) {

        Family family = new Family();
        family.name = name;
        family.mother = mother;

        return familyRepository.save( family );
    }

    @GetMapping("/family/delete/{id}")
    public void deleteById( @PathVariable long id ) {

        familyRepository.deleteById( id );
    }
}