package com.springcore.beanfactory;

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
