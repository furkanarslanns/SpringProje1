package com.furkanarslan.SpringProje1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.furkanarslan"})
@SpringBootApplication

public class SpringProje1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProje1Application.class, args);
	}

}
