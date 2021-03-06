package com.peach.springtest.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class House implements InitializingBean, DisposableBean {

    private Person person;

    @Autowired
    private Car car;

    public House() {
        System.out.println("Test house Constructor");
    }

    public void status() {
        System.out.println("There is one person and one car");
    }

    @Autowired

    public void setPerson(Person person) {
        System.out.println("Test House setPerson");
        this.person = person;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Test house afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Test house postConstruct");
    }

    public void initMethod() {
        System.out.println("Test house initMethod");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Test house preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Test house destroy");
    }

    public void destroyMethod() {
        System.out.println("Test house destroyMethod");
    }
}
