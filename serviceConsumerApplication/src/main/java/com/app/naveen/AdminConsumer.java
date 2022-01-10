package com.app.naveen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class AdminConsumer implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> response=rt.getForEntity("http://localhost:1764/provider/service", String.class);
		System.out.println(response.getBody());
		System.exit(0);
		
	}

}
