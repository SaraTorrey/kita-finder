package com.kitafinder.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kita {

    @Id
    public String id;

    public String name;
    public String location;
    public boolean elemenetar;
    public boolean krippe;

}