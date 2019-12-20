package com.explorecountry.explorecountry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ExplorecountryApplication {


	public static void main(String[] args) {
		SpringApplication.run(ExplorecountryApplication.class, args);
	}

}