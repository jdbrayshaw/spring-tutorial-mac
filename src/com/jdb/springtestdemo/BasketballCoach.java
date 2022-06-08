package com.jdb.springtestdemo;

public class BasketballCoach implements Coach{

    // define a private field for dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BasketballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "30 layups";
    }

    @Override
    public String getDailyFortune() {
        return "basketball: " + fortuneService.getFortune();
    }
}
