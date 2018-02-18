package com.hetman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Speaker elon = (Speaker) context.getBean("elon");
        elon.speakAbout(elon.getFavouriteTopic());
    }
}
