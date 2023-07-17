package com.example.spring_annotation;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        System.out.println("We are here");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(StudnetConfig.class);
        Student student = (Student) applicationContext.getBean("studentBean", Student.class);
        student.setName("F1Soft Internationals");
        System.out.println("Student Name: " + student.getName());
    }
}
