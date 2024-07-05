package com.polarbookshop.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CatalogService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CatalogService1Application.class, args);
	}

}
