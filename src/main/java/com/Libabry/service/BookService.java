package com.Libabry.service;

import java.util.List;
import java.util.Optional;

import com.Libabry.model.Book;

public interface BookService {

	/**
	 * 
	 * @param book
	 * @return
	 */
	String addbook(Book book);
	/**
	 * 
	 * @return
	 */
	List<Book> getAllBooks();
	/**
	 * 
	 * @param bookId
	 * @return
	 */
	Optional<Book> getByBookId(Long bookId);
	/**
	 * 
	 * @param authorId
	 * @return
	 */
	Optional<Book> getByAuthorId(Long authorId);
	/**
	 * 
	 * @param catgoryId
	 * @return
	 */
	Optional<Book> getByCatagoryId(Long catgoryId );
	/**
	 * 
	 * @param book
	 * @param bookId
	 * @return
	 */
	String updatingBook(Book book, Long bookId);

}
