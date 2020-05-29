package com.navneet.library.repository;

import com.navneet.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByPublisher(String publisher);

    List<Book> findBy(String publisher);

}
