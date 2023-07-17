package com.example.spring_annotation;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        System.out.println("We are here");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("file.xml");
        Student student = (Student) applicationContext.getBean("studentBean");
        student.setName("F1Soft Internationals");
        System.out.println("Student Name: " + student.getName());
        System.out.println("The code finishes here");
    }
}
