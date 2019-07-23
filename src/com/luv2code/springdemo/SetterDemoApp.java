package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on the bean
        // ... let's come back to this ...
        System.out.println(theCricketCoach.getDailyWorkout());

        System.out.println(theCricketCoach.getDailyFortune());

        // call our literals values methods

        System.out.println(theCricketCoach.getEmailAddress());

        System.out.println(theCricketCoach.getTeam());
        // close the context
        context.close();
    }
}
