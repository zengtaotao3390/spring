package com.peach.springtest.model;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by y400 on 2015/12/6.
 */

public class Car implements InitializingBean{

    public Car() {
        System.out.println("Test car constructor");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Test car afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Test Car PostConstruct");
    }
}
