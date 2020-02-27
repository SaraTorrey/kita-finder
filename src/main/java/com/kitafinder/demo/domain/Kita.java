package com.kitafinder.demo.domain;

import com.kitafinder.demo.KitaType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kita {

    public Kita() {

    }

    public Kita( String name ) {

        this.name = name;
    }

    @Id
    @GeneratedValue
    public Long id;

    public String name;
    public String location;
    public KitaType type;


    @Override public String toString() {

        return "Kita name is " + name +
               ". Id = " + id +
               " located at " + location + ".";
    }
}