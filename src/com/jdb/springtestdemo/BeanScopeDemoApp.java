package com.jdb.springtestdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");

        // retrieve beans from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean areSame = (theCoach == alphaCoach);

        System.out.println("Are these the same obj? " + areSame);
        System.out.println("mem loc for coach " + theCoach);
        System.out.println("mem loc for alpha coach " + alphaCoach);

        context.close();
    }
}
