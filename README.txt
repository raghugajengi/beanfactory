Spring – Understanding Inversion of Control with Example

Spring IoC (Inversion of Control) Container creates the objects, configures and assembles their dependencies, manages their entire life cycle. 
The Container uses Dependency Injection(DI) to manage the components that make up the application. It gets the information about the objects from 
a configuration file(XML) or 
Java Code or 
Java Annotations and 
Java POJO class. These objects are called Beans. 
Since the Controlling of Java objects and their lifecycle is not done by the developers, hence the name Inversion Of Control.

There are 2 types of IoC containers:

BeanFactory 
ApplicationContext 

Implementation: 

So now let’s understand what is IoC in Spring with an example. Suppose we have one interface named Sim and it has some abstract methods calling()
and data().

// Java Program to Illustrate Sim Interface
public interface Sim 
{
	void calling();
	void data();
}


Now we have created another two classes Airtel and Jio which implement the Sim interface and override the interface methods.

// Java Program to Illustrate Airtel Class

// Class
// Implementing Sim interface
public class Airtel implements Sim {

	@Override public void calling()
	{
		System.out.println("Airtel Calling");
	}

	@Override public void data()
	{
		System.out.println("Airtel Data");
	}
}


// Java Program to Illustrate Jio Class

// Class
// Implementing Sim interface
public class Jio implements Sim{
	@Override
	public void calling() {
		System.out.println("Jio Calling");
	}

	@Override
	public void data() {
		System.out.println("Jio Data");
	}
}

 
So let’s now call these methods inside the main method. So by implementing the Run time polymorphism concept we can do something like this

// Java Program to Illustrate Mobile Class

// Class
public class Mobile {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating instance of Sim interface
		// inside main() method
		// with reference to Jio class constructor
		// invocation
		Sim sim = new Jio();

		// Sim sim = new Airtel();

		sim.calling();
		sim.data();
	}
}

But what happens if in the future another new Sim Vodafone came and we need to change again to the child class name in the code, like this

Sim sim = new Vodafone();
So we have to do our configuration in the source code. So how to make it configurable? We don’t want to touch the source code of this. 
The source code should be constant. And how can we make it? Here Spring IoC comes into the picture. So in this example, 
we are going to use ApplicationContext to implement an IoC container. First, we have to create an XML file and name the file as “beans.xml“.

Example: beans.xml File 

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	https://www.springframework.org/schema/beans/spring-beans.xsd">

<bean id="sim" class="Jio"></bean>

</beans>


Output Explanation: In the beans.xml file, we have created beans. So inside the id, we have to pass the unique id and inside the class, 
we have to pass the Class name for which you want to create the bean. Later on, inside the main method, we can tweek it out that will be described in the 
upcoming program.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		// Using ApplicationContext tom implement Spring IoC
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		// Get the bean
		Sim sim = applicationContext.getBean("sim", Sim.class);
		
		// Calling the methods
		sim.calling();
		sim.data();
	}
}

And now if you want to use the Airtel sim so you have to change only inside the beans.xml file. The main method is going to be the same.

<bean id="sim" class="Airtel"></bean>
