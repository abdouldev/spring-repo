package com.luv2code.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    // define a default controller
    public PingPongCoach() {
        System.out.println(">> PingPongCoach: inside default controller");
    }

    @Override
    public String getDailyWorkout() {
        return "Teach yourself";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
