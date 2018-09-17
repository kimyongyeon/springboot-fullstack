package com.study.full.stack.fullstack_project;

import com.study.full.stack.fullstack_project.service.BookRepository;
import com.study.full.stack.fullstack_project.service.SimpleBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan(basePackages = "com.study.full.stack.fullstack_project.service")
@EnableCaching
@Slf4j
public class FullstackProjectApplication implements CommandLineRunner{

	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(FullstackProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		bookRepository = new SimpleBookRepository();
		log.info("....fetching books");
		log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		log.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
		log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		log.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
		log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));

	}
}
