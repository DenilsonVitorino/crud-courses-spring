package com.denilson.crudspring;

import com.denilson.crudspring.model.Course;
import com.denilson.crudspring.repository.CourseRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();
			var c1 = new Course();	
			c1.setName("Angular");
			c1.setCategory("Front-End");
			courseRepository.save(c1);
			var c2 = new Course();
			c2.setName("Spring");
			c2.setCategory("Back-End");
			courseRepository.save(c2);
		};
	}

}
