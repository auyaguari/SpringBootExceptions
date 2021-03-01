package edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan({"edu.spring.exceptions,..." })
public class SprintDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintDemoApplication.class, args);
	}

}
