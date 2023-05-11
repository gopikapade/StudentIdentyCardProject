package com.cjc.main.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentIdentityCardApplication {

	public static void main(String[] args) {
		System.out.println("Student Id");
		SpringApplication.run(StudentIdentityCardApplication.class, args);
	}

}
