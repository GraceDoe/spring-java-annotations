package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
   private FortuneService fortuneService;


   //default constructor

    public TennisCoach() {
        System.out.println(">> Tennis Coach: inside default constructor");
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach : inside of doMyStartupStuff()");
    }

    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println(">> TennisCoach : inside of doMyCleanUpStuff()");
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
