package com.jdb.springtestdemo;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "This is your fortune!";
    }
}
