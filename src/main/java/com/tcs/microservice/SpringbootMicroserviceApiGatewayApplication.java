package com.tcs.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootMicroserviceApiGatewayApplication {

	public static void main(String[] args) {
		System.out.println("hello from main method calss");
		SpringApplication.run(SpringbootMicroserviceApiGatewayApplication.class, args);
	}

}
