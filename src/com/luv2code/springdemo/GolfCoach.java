package com.luv2code.springdemo;

public class GolfCoach implements Coach {

    private FortuneService fortuneService;

    // inject the service into the constructor
    public GolfCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Destroy the grass with some nice shoots";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
