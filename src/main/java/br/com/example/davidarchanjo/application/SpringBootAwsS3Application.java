package br.com.example.davidarchanjo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "br.com.example.davidarchanjo")
@SpringBootApplication(scanBasePackages = "br.com.example.davidarchanjo")
public class SpringBootAwsS3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsS3Application.class, args);
	}

}
