package com.vinothit.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vinothit.repository.BookRepository;
import com.vinothit.entity.Book;

@Controller
public class BookController {

	@Autowired
	private BookRepository repository;
	
	@GetMapping("/bookview")
	public ModelAndView getBookView(@RequestParam("id") Integer id) {
		
	  ModelAndView mav=new ModelAndView();

	  Optional<Book> findById = repository.findById(id);
	  
	  if(findById.isPresent()) {
		  Book bookObj=findById.get();
		  mav.addObject("book", bookObj);
	  }
	  
	  mav.setViewName("index");
	  
	  return mav;
	}
	
}
