package com.kitafinder.demo;

import com.kitafinder.demo.domain.Kita;
import com.kitafinder.demo.repository.KitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ServiceKita {

    @Autowired
    KitaRepository kitaRepository;

    @PostConstruct
    public void kitaStartUp() {

        // Load some Kita sample data
        Kita theBestKita = new Kita( "The Best Kita" );
        theBestKita.type = KitaType.KRIPPE;
        theBestKita.location = "Arnoldstraße 2";
        kitaRepository.save( theBestKita );

        Kita kitaMaxBrauerAllee = new Kita( "Kita Max-Brauer-Allee" );
        kitaMaxBrauerAllee.type = KitaType.BOTH;
        kitaMaxBrauerAllee.location = "Max-Brauer-Allee 36";
        kitaRepository.save( kitaMaxBrauerAllee );


        Kita kitaOttensen = new Kita("Kita Ottensen");
        kitaOttensen.type = KitaType.KRIPPE;
        kitaOttensen.location = "Friedensallee 10";
        kitaRepository.save( kitaOttensen );


        Kita kitAltonaAltstadt = new Kita( "Kita Altona-Altstadt" );
        kitAltonaAltstadt.type = KitaType.BOTH;
        kitAltonaAltstadt.location = "Königstraße 20";
        kitaRepository.save( kitAltonaAltstadt ) ;


        Kita kitElbe = new Kita( "Kita Elbe" );
        kitElbe.type = KitaType.ELEMENTAR;
        kitElbe.location = "Elbchaussee 35b";
        kitaRepository.save( kitElbe );

        System.out.println( kitaRepository.findAll() );
    }
}