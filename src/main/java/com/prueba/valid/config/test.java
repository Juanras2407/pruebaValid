package com.prueba.valid.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
//configuracion de la aplicacion
@Configuration
public class test {
	@Bean(name="config")
	@Primary
	private static void test() {
		
	}

}