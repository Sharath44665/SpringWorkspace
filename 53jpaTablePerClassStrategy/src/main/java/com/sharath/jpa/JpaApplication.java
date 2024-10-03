package com.sharath.jpa;

import com.sharath.jpa.models.Author;
import com.sharath.jpa.models.Video;
import com.sharath.jpa.repositories.AuthorRepository;
import com.sharath.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository,
											   VideoRepository videoRepository) {
		return args -> {
//			var author = Author.builder()
//					.firstName("alibou")
//					.lastName("alibou")
//					.age(34)
//					.email("contact@aliboucoding.com")
//					.build();
//			repository.save(author);

			var video = Video.builder()
					.name("demo video")
					.videoLength(5) // min
					.build();
			videoRepository.save(video);
		};
	}

}