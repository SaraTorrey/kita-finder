package com.kitafinder.demo.service;

import com.kitafinder.demo.KitaType;
import com.kitafinder.demo.domain.Kita;
import com.kitafinder.demo.repository.KitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class KitaService {

    @Autowired
    KitaRepository kitaRepository;

    @PostConstruct
    public void kitaStartUp() {

        // Load some Kita sample data
        Kita theBestKita = new Kita( "The Best Kita" );
        theBestKita.type = KitaType.KRIPPE;
        theBestKita.location = "Arnoldstraße 2";
        theBestKita.photoURLs.add(
                "https://images.unsplash.com/photo-1564429238817-393bd4286b2d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1567&q=80" );
         theBestKita.photoURLs.add(
                "https://images.unsplash.com/flagged/photo-1551887373-6edba6dacbb1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80" );
        kitaRepository.save( theBestKita );


        Kita kitaMaxBrauerAllee = new Kita( "Kita Max-Brauer-Allee" );
        kitaMaxBrauerAllee.type = KitaType.BOTH;
        kitaMaxBrauerAllee.location = "Max-Brauer-Allee 36";
        kitaMaxBrauerAllee.photoURLs.add("https://images.unsplash.com/photo-1564429097439-e400382dc893?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1567&q=80");
        kitaRepository.save( kitaMaxBrauerAllee );


        Kita kitaOttensen = new Kita("Kita Ottensen");
        kitaOttensen.type = KitaType.KRIPPE;
        kitaOttensen.location = "Friedensallee 10";
        kitaOttensen.photoURLs.add(
                "https://images.unsplash.com/photo-1578642401932-7feaf878cda9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1562&q=80" );
        kitaRepository.save( kitaOttensen );


        Kita kitAltonaAltstadt = new Kita( "Kita Altona-Altstadt" );
        kitAltonaAltstadt.type = KitaType.BOTH;
        kitAltonaAltstadt.location = "Königstraße 20";
        kitAltonaAltstadt.photoURLs.add(
                "https://images.unsplash.com/photo-1576500714954-8a687d0ea1ef?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80" );
        kitaRepository.save( kitAltonaAltstadt ) ;


        Kita kitaElbe = new Kita( "Kita Elbe" );
        kitaElbe.type = KitaType.ELEMENTAR;
        kitaElbe.location = "Elbchaussee 35b";
        kitaElbe.photoURLs.add(
                "https://images.unsplash.com/photo-1527324768326-5fa4869a351e?ixlib=rb-1.2.1&auto=format&fit=crop&w=934&q=80" );
        kitaRepository.save( kitaElbe );

        System.out.println( kitaRepository.findAll() );
    }

    public String getMessage() {

        return "hi there";
    }
}