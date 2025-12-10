package com.tcs.microservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudCConfig {
	
	
	@Bean
	RouteLocator gateWayROutes(RouteLocatorBuilder builder) {
		
		return
				builder
				.routes()
				.route("Spring-boot-demo-app-rest-loan-controller", r -> r.path("/loan/api/v1.0/**") // microservice name and base path of that rest controller
				.filters(f -> f.addResponseHeader("X-Response-Header", "World"))
				.uri("http://localhost:8090")) // micro-service port
				.build();
	}

}
