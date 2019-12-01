package com.org.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class OrgAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgAddressApplication.class, args);
	}

}
