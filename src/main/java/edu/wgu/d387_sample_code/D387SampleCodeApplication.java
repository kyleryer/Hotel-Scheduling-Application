package edu.wgu.d387_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		Thread threadEN = new Thread(() -> {
			DisplayMessage displayMessage = new DisplayMessage(Locale.US);
			System.out.println(displayMessage);
		});

		Thread threadFR = new Thread(() -> {
			DisplayMessage displayMessage = new DisplayMessage(Locale.CANADA_FRENCH);
			System.out.println(displayMessage);
		});

		threadEN.start();
		threadFR.start();
	}

}
