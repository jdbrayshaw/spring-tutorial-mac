package com.jdb.springtestdemo;

public class BaseballCoach implements Coach{

    // define a private field for dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "spend 30 min batting";
    }

    @Override
    public String getDailyFortune() {

        // use myFortuneService to get a fortune
        return fortuneService.getFortune();

    }
}
