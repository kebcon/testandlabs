package io.mikaila.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseapiApplication {

	public static void main(String[] args) {
		//Static Class calling static method that takes two arguments
		SpringApplication.run(CourseapiApplication.class, args);  //pass in mame of Class - CourseapiApplication
	}
}
