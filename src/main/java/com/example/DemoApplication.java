package com.example;

import com.example.lifecycle.afterinit.WithInitializingBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	private static ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});

	public static void main(String[] args) {

		System.out.println("before get withInitializingBean from container");

		WithInitializingBean withInitializingBean = context.getBean("withInitializingBean", WithInitializingBean.class);

		System.out.println("after get withInitializingBean from container");
	}
}
