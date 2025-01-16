package edu.webservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServiceConsumeAkNApplication {

	public static void main(String[] args) 
	{
	
		System.out.println("webService Consume ");
		SpringApplication.run(WebServiceConsumeAkNApplication.class, args);
	}

	@Bean
	public RestTemplate rt()
	{
		RestTemplate tr= new RestTemplate();
		
		return tr;
		
		
	}
	
}
