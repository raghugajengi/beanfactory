package com.springcore.beanfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanfactoryApplication {

	public static void main(String[] args) {

		 // Using ApplicationContext tom implement Spring IoC
        @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
         
        // Get the bean
        Sim sim = applicationContext.getBean("sim", Sim.class);
         
        // Calling the methods
        sim.calling();
        sim.data();
 		
	}

}
