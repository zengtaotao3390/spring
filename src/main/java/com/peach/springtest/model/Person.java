package com.peach.springtest.model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by y400 on 2015/12/6.
 */
@Component
public class Person implements InitializingBean{


    public Person() {
        System.out.println("Test Person constructor");
    }

/*
    public void setCat(Car car) {
        System.out.println("Test setCar");
        this.car = car;
    }*/


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Test Person afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Test Person postConstruct");
    }
}
