package com.jdb.springtestdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
    private String[] fortuneList = {"test fortune", "other test fortune", "third test fortune"};
    private Random rand = new Random();
    @Override
    public String getFortune() {
        return fortuneList[rand.nextInt(fortuneList.length)];
    }
}
