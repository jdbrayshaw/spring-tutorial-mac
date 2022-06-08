package com.jdb.springtestdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class ActivityTwoRandFortDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myRandomCoach = context.getBean("myRandomCoach", CricketCoach.class);
        System.out.println(myRandomCoach.getDailyFortune());
        context.close();
    }
}
