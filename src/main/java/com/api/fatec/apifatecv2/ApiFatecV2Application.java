package com.api.fatec.apifatecv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ApiFatecV2Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiFatecV2Application.class, args);
		LocalDate date = LocalDate.now();
		System.out.println(date);
	}

}
