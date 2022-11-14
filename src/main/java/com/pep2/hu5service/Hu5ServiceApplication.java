package com.pep2.hu5service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Hu5ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hu5ServiceApplication.class, args);
	}

}
