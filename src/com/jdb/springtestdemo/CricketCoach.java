package com.jdb.springtestdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    // create no args constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no arg constructor");
    }
    public CricketCoach(FortuneService myFortuneService) {
        System.out.println("we are in the CricketCoach constructor");
        this.fortuneService = myFortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter for CricketCoach");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter for setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter for setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
    @Override
    public String getDailyWorkout() {
        return "play cricket";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
