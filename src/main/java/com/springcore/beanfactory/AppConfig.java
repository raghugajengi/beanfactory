package com.springcore.beanfactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

// Class
public class AppConfig {

  @Bean
  public Student student() {

    return new Student("Geek", "1");
  }

}