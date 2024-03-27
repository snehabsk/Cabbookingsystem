package org.demoProject;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabBookingApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CabBookingApplication.class, args);
		
		SpringApplication app = new SpringApplication(CabBookingApplication.class);
		app.setDefaultProperties(Collections
		          .singletonMap("server.port","5001"));
		app.run(args);
	}

}
