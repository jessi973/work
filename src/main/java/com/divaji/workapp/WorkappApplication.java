package com.divaji.workapp;

import static org.mockito.ArgumentMatchers.intThat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkappApplication.class, args);
	}

	
	public void push() {
		int i=0;
		String s="divaji";
	}
  
	public void get() {
		int i=10;
		String  s="bannu";
	}
	

}
