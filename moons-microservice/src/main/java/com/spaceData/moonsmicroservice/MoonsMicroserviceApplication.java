package com.spaceData.moonsmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MoonsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoonsMicroserviceApplication.class, args);
	}

}
