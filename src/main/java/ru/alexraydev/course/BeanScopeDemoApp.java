package ru.alexraydev.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //true if scope=singleton, false if scope=prototype
        System.out.println(theCoach == alphaCoach);

        context.close();
    }
}
