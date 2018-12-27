package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
   private FortuneService fortuneService;


   //default constructor

    public TennisCoach() {
        System.out.println(">> Tennis Coach: inside default constructor");
    }
    /*@Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(">> Tennis Coach: inside doSomeCrazyStuff() method");

        this.fortuneService = fortuneService;
    }*/

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
