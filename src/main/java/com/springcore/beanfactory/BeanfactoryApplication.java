package com.springcore.beanfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

		// Creating object in a spring container (Beans) =======BeanFactory=======
		@SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("beans-factory.xml");
		Student student = (Student) factory.getBean("student");
	
		System.out.println(student);

		//ANnotationCOntext 
 		// Creating its object
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student1 = context.getBean(Student.class);

		// Print and display
		System.out.println(student1);
	}

}
