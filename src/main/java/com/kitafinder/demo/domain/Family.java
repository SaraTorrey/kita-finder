package com.kitafinder.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Family {

        @Id
        @GeneratedValue
        public Long id;
        public String name;
        public String mother;
        public String father;
        public String children;


        @Override public String toString() {

                return "Family name is " + name +
                       ". Mother's name is " + mother +
                       ". Father's name is " + father +
                       ". Their children are " + children + ".";
        }

}