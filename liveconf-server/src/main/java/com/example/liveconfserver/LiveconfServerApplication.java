package com.example.liveconfserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LiveconfServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveconfServerApplication.class, args);
	}

}
