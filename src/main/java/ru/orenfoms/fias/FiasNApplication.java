package ru.orenfoms.fias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class FiasNApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiasNApplication.class, args);
		System.out.println("Hello fias");
		//List<Integer> stream = Stream.iterate(0, x -> x + 1).limit(10L).toList();
	}

}
