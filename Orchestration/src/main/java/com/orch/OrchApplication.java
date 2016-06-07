package com.orch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class OrchApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(
				OrchApplication.class, args);
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<List> entity = restTemplate
//				.getForEntity(
//						"http://localhost:9000/catalog/product/search/{searchType}?searchValue={searchValue}",
//						List.class, "BRAND", "rbk");
//		System.out.println(entity);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
