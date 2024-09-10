package com.fiuni.mytube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = "com.fiuni.mytube.domain")
public class MytubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytubeApplication.class, args);
	}

}
