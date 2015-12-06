package com.peach.springtest;

import com.peach.springtest.model.House;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        House house = (House) context.getBean("house");
        house.status();
        context.registerShutdownHook();
    }
}
