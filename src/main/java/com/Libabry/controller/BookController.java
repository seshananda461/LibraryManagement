package com.Libabry.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Libabry.model.Book;
import com.Libabry.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	/**
	 * 
	 * @param book
	 * @return
	 */
	@PostMapping("addingBook")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		bookService.addbook(book);
		return new ResponseEntity<String>("Book Added Susccesfully",HttpStatus.ACCEPTED);
		
	}
	/**
	 * 
	 * @return
	 */
	@GetMapping("/getallbooks")
	public ResponseEntity<List<Book>> getAllBooks(){
		return new ResponseEntity<List<Book>>(bookService.getAllBooks(),HttpStatus.OK);
		
	}
	/**
	 * 
	 * @param bookId
	 * @return
	 */
	@GetMapping("/getbybookid")
	public ResponseEntity<Optional<Book>> getByBookId(@RequestParam  Long bookId){
		return new ResponseEntity<Optional<Book>>(bookService.getByBookId(bookId),HttpStatus.OK);
		
	}
	/**
	 * 
	 * @param authorId
	 * @return
	 */
	
	@GetMapping("/getbyauthorid")
	public ResponseEntity<Optional<Book>> getByAuthorId(@RequestParam  Long authorId){
		return new ResponseEntity<Optional<Book>>(bookService.getByAuthorId(authorId),HttpStatus.OK);
		
	}
	/**
	 * 
	 * @param catgoryId
	 * @return
	 */
	@GetMapping("/getbycatgoryid")
	public ResponseEntity<Optional<Book>> getByCatagoryId(@RequestParam  Long catgoryId){
		return new ResponseEntity<Optional<Book>>(bookService.getByCatagoryId(catgoryId),HttpStatus.OK);
		
	}
	/**
	 * 
	 * @param book
	 * @param bookId
	 * @return
	 */
	@PutMapping("/updatingbook")
	public ResponseEntity<String> updatingBook(@RequestBody Book book,@RequestParam  Long bookId){
		return new ResponseEntity<String>(bookService.updatingBook(book,bookId),HttpStatus.ACCEPTED);
		
	}
}
