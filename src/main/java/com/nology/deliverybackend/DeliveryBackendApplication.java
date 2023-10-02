package com.nology.deliverybackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class DeliveryBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryBackendApplication.class, args);
	}

}

//(exclude = {DataSourceAutoConfiguration.class})