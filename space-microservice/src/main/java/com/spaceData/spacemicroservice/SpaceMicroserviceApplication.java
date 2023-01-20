package com.spaceData.spacemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpaceMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaceMicroserviceApplication.class, args);
	}

}
