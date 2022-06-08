package com.jdb.springtestdemo;

public class TrackCoach implements Coach {

    // define a private field for dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "run hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "track: " + fortuneService.getFortune();
    }
}
