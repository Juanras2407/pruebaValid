package com.prueba.valid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.MapperFeature;
//arranque de aplicacion
@SpringBootApplication
public class ValidApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ValidApplication.class, args);
	}

}
