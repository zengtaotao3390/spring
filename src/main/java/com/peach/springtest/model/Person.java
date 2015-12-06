package com.peach.springtest.model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Person implements InitializingBean {


    public Person() {
        System.out.println("Test Person constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Test Person afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Test Person postConstruct");
    }
}
