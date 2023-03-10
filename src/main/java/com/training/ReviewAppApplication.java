package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.training.dal.ReviewRepository;
import com.training.domain.Review;

@SpringBootApplication
public class ReviewAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ReviewAppApplication.class, args);
		testRepo(ctx);
	}

	private static void testRepo(ApplicationContext ctx) {
		ReviewRepository repo = ctx.getBean(ReviewRepository.class);
		
		Review r = new Review("self", "this is test", 5, 1);
		
		repo.save(r);
		
	}

}
