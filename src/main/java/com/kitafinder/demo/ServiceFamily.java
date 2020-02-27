package com.kitafinder.demo;

import com.kitafinder.demo.domain.Family;
import com.kitafinder.demo.repository.FamilyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class ServiceFamily {

    @Autowired
    FamilyRepository familyRepository;

    @PostConstruct
    public void familyStartUp() {

        Family familyTorrey = new Family();
        familyTorrey.name = "Torrey";
        familyTorrey.mother = "Sara";
        familyTorrey.father = "Dan";
        familyTorrey.children = "Owen and Cameron";

        familyRepository.save(familyTorrey);
        System.out.println( familyTorrey );

        Family familyFay = new Family();
        familyFay.name = "Fay";
        familyFay.mother = "Vim";
        familyFay.father = "Jim";
        familyFay.children = "Jenya & Baby Jim";

        familyRepository.save( familyFay );
        System.out.println( familyFay );

        System.out.println( familyRepository.findAll() );
    }
}