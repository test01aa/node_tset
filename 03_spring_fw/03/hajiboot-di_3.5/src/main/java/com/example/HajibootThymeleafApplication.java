package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //@Configuration と @EnableAutoConfiguration と @ComponentScan を設定したことと同じ
public class HajibootThymeleafApplication {
	public static void main(String[] args){
		SpringApplication.run(HajibootThymeleafApplication.class, args);
	}
}
