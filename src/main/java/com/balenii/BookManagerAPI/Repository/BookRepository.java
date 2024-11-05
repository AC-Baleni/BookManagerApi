package com.balenii.BookManagerAPI.Repository;

import com.balenii.BookManagerAPI.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

}
