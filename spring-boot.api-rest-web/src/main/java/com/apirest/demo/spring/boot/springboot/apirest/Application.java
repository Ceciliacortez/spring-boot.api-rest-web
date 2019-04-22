package com.apirest.demo.spring.boot.springboot.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



//@SpringBootApplication (scanBasePackages = {"com.apirest"})
@ComponentScan(basePackages = {"controller","com.apirest"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
//@ComponentScan(basePackageClasses = RegistroPersonaController.class)

//@ExceptionHandler(NoHandlerFoundException.class)
@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class Application  extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		
	}

}
