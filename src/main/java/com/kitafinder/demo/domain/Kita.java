package com.kitafinder.demo.domain;

import com.kitafinder.demo.KitaType;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class Kita extends BaseEntity{

    public Kita() {

    }

    public Kita( String name ) {

        this.name = name;
    }


    public String name;
    public String location;
    public KitaType type;

    @ElementCollection
    public List<String> photoURLs = new ArrayList<>();


    @Override public String toString() {

        return "Kita name is " + name +
               ". Id = " + id +
               " located at " + location + ".";
    }
}