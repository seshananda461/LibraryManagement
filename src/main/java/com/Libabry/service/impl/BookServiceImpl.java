package com.Libabry.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Libabry.model.Book;
import com.Libabry.repository.BookRepository;
import com.Libabry.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public String addbook(Book book) {
		bookRepository.save(book);
		return "Success";
	}

	@Override
	public 	List<Book> getAllBooks() {
		return bookRepository.findAll();
		
	}

	@Override
	public Optional<Book> getByBookId(Long bookId) {
		return bookRepository.findById(bookId);
		}

	@Override
	public Optional<Book> getByAuthorId(Long authorId) {
		return bookRepository.findByauthorId(authorId);
	}

	@Override
	public Optional<Book> getByCatagoryId(Long catgoryId) {
		return bookRepository.findBycategoryId(catgoryId);
	}

	@Override
	public String updatingBook(Book book, Long bookId) {
		bookRepository.findById(bookId);
		return "Book Updated";
	}



}
