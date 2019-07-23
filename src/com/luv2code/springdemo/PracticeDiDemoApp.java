package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeDiDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from container
        Coach theGolfCoach = context.getBean("myGolfCoach", Coach.class);

        // call methods on the bean
        System.out.println(theGolfCoach.getDailyWorkout());
        System.out.println(theGolfCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
