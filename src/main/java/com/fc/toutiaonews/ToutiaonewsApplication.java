package com.fc.toutiaonews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication/*(exclude = DataSourceAutoConfiguration.class)*/
public class ToutiaonewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToutiaonewsApplication.class, args);
	}
}
