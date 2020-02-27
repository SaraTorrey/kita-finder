package com.kitafinder.demo;

import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class ServiceFamily {

    @PostConstruct
    public void familyStartUp() {
        Family familyTorrey = new Family();
        familyTorrey.mom = "Sara";
        familyTorrey.dad = "Dan";
        familyTorrey.son = "Owen and Cameron";

        System.out.println( familyTorrey );

        Family familyFay = new Family();
        familyFay.mom = "Vim";
        familyFay.dad = "Jim";
        familyFay.daughter = "Jenya";

        System.out.println( familyFay );

        System.out.println( "Family is running." );
    }
}