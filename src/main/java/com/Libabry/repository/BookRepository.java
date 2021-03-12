package com.Libabry.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Libabry.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	Optional<Book> findByauthorId(Long authorId);

	Optional<Book> findBycategoryId(Long catgoryId);



	



}
