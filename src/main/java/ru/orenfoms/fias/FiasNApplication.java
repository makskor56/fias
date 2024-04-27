package ru.orenfoms.fias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class FiasNApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiasNApplication.class, args);
		System.out.println("Hello fias");
		//List<Integer> stream = Stream.iterate(0, x -> x + 1).limit(10L).toList();
	}

}
