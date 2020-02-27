package com.kitafinder.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ServiceKita {

    @PostConstruct
    public void kitaStartUp() {


        System.out.println( "kita is running." );
    }
}