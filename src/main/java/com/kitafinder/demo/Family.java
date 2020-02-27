package com.kitafinder.demo;

public class Family {


        public String mom;
        public String dad;
        public String son;
        public String daughter;


        @Override public String toString() {

                return "Family{" +
                       "dad is'" + dad + '\'' +
                       ", daughter='" + daughter + '\'' +
                       ", mom='" + mom + '\'' +
                       ", son='" + son + '\'' +
                       '}';
        }

}