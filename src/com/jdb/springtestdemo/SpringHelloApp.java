package com.jdb.springtestdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String args[]) {

        // load spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve a bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // call methods on bean
        System.out.println(theCoach.getDailyWorkout());
        // call new method for fortunes that was injected
        System.out.println(theCoach.getDailyFortune());
        // close context
        context.close();
    }
}
