package com.sharath.jpa;

import com.github.javafaker.Faker;
import com.sharath.jpa.models.Author;
import com.sharath.jpa.models.Video;
import com.sharath.jpa.repositories.AuthorRepository;
import com.sharath.jpa.repositories.VideoRepository;
import com.sharath.jpa.specification.AuthorSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository,
											   VideoRepository videoRepository) {
		return args -> {
//			for (int idx =0;idx< 50;idx++){
//				Faker faker= new Faker();
//				var author = Author.builder()
//					.firstName(faker.name().firstName())
//					.lastName(faker.name().lastName())
//					.age(faker.number().numberBetween(18,62))
//					.email(faker.name().username()+"@example.com")
//					.build();
//				repository.save(author);
//			}


//			var video = Video.builder()
//					.name("demo video")
//					.videoLength(5) // min
//					.build();
//			videoRepository.save(video);

			// updating id 1 with myname
			// from the below, if id not found, it will insert the data creating id
//			var author = Author.builder()
//					.id(1)
//					.firstName("sharath")
//					.lastName("chandra")
//					.age(22)
//					.email("sharathchandra@example.com")
//					.build();
//				repository.save(author);

			// update author a set a.age = 23, where a.id =
//			repository.updateAuthor(1, 33);

			// update all lastname
//			repository.updateAllLastNames("chandra");

			// find by named query
			// this is not working
//			repository.findByNamedQuery(11).forEach(System.out::println);
//			 var x = repository.findByNamedQuery(11);
//			System.out.println(x.size());
			// this is working
//			for (Author author : x) {
//				System.out.println(author.getFirstName());
//
//			}


//			repository.updateByNamedQuery(12);		// working

			Specification<Author> spec = Specification.where(AuthorSpecification.hasAge(42)
					.or(AuthorSpecification.firstNameContains("R")));
//			List<Author> entities = repository.findAll(spec);
//			for (Author entity : entities) {
//				System.out.println(entity.toString());
//			}
			repository.findAll(spec).forEach(System.out::println);

		};


	}

}