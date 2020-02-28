package com.kitafinder.demo.controller;

import com.kitafinder.demo.repository.FamilyRepository;
import com.kitafinder.demo.repository.KitaRepository;
import com.kitafinder.demo.service.FamilyService;
import com.kitafinder.demo.service.KitaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Autowired
    FamilyRepository familyRepository;

    @Autowired
    FamilyService familyService;

    @Autowired
    KitaService kitaService;

    @Autowired
    KitaRepository kitaRepository;


    @GetMapping( "/" )

    public String mainPage( Model model ) {

        model.addAttribute( "families", familyRepository.findAll() );

        return "index";
    }


    @GetMapping( "/kitaPhotos" )
    public String kitaPhotos( Model model ) {

        model.addAttribute( "kitas", kitaRepository.findAll() );

        return "kitaPhotos";

    }
}