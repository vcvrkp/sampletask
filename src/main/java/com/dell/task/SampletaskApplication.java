package com.dell.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SampletaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampletaskApplication.class, args);
	}

	@Bean
	public MyTask myTask() {
		return new MyTask();
	}
}
