package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

import com.example.demo.config.S3Config;

@SpringBootApplication
@Import(S3Config.class)
public class ProyectoUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoUsuarioApplication.class, args);
	}

}
