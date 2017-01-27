package com.spring.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class Application {

	public static HashMap<Long,Student> hmStudent;

	public static void main(String[] args) {

		hmStudent = new HashMap<Long,Student>();

		Student one= new Student("jhon","Maths");
		hmStudent.put(new Long(one.getId()),one);

		SpringApplication.run(Application.class, args);

		Student two = new Student("naveen","chemistry");
		hmStudent.put(new Long(two.getId()),two);

	}
}
