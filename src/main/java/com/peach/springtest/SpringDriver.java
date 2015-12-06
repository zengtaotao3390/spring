package com.peach.springtest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by y400 on 2015/12/6.
 */
public class SpringDriver {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        context.registerShutdownHook();
    }
}
