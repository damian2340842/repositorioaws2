package com.example.demo.config;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class S3Config {

    @Bean
    public AmazonS3 amazonS3Client() {
        return new AmazonS3Client(); // Puedes personalizar la creación del cliente según tus necesidades.
    }
}