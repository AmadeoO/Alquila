package com.powersys.Alquila.Alquila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {
	    "com.powersys.Alquila"
	})
@EnableJpaRepositories("com.powersys.Alquila.repositories") 
@EntityScan(basePackages = {"com.powersys.Alquila.models"})
public class AlquilaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlquilaApplication.class, args);
	}
}
