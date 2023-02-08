package com.example.liveconfclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiveconfClientApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LiveconfClientApplication.class, args);
	}

	@Autowired
	private LiveConfiguration liveConfiguration;

	@Override
	public void run(String... args) throws Exception {

		while(true){
			System.out.println(liveConfiguration.getMessage());
			Thread.sleep(1000);
		}
	}

}
