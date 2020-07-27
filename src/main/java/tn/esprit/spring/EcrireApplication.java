package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.esprit.spring.test.Tesst;

@SpringBootApplication
public class EcrireApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcrireApplication.class, args);
		Tesst x = new Tesst();
		x.Bonjour();
		x.Byby();
	
	}

	
}
