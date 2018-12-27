package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main (String[] args){

        //load sring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from sirng cotainer
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
        //check if they are the same
        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPonting to the same object: "+ result);
        System.out.println("\nMemory location for theCoch: "+ theCoach);
        System.out.println("\nMemory location for alphaCoach: "+ alphaCoach);


        context.close();


    }
}

