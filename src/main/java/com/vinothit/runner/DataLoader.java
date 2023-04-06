package com.vinothit.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vinothit.entity.Book;
import com.vinothit.repository.BookRepository;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private BookRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("run() method is only one time called from DataLoader class when Spring Boot Application starts fisrt time.....");
		
		/*Book b1=new Book(1,"Spring",200.00);
		Book b2=new Book(2,"SpringBoot",300.00);
		Book b3=new Book(3,"AWS",400.00);
		Book b4=new Book(4,"Spring Cloud",500.00);
		Book b5=new Book(5,"Java",600.00);
		
		List<Book> allBooks = Arrays.asList(b1,b2,b3,b4,b5);
		
		repository.saveAll(allBooks);*/
		
		System.out.println("Books are added to DB successfully.......");
		
	}

}
