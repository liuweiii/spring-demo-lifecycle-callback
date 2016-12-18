package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        context.close();

        ClassPathXmlApplicationContext context_default = new ClassPathXmlApplicationContext(new String[]{"beans-default.xml"});
        context_default.close();

    }
}
