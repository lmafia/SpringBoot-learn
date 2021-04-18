package com.lmafia.mongodemo;

import com.lmafia.mongodemo.dao.BookDao;
import com.lmafia.mongodemo.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class MongodemoApplicationTests {

    @Autowired
    BookDao bookDao;


    @Test
    void saveBook1() {
        Book book = new Book();
        book.setAuthor("lmaifa");
        book.setId(1);
        book.setName("java.book");
        book.setPrice(13.0);
        bookDao.save(book);
    }
    @Test
    void saveBook2() {
        Book book = new Book();
        book.setAuthor("hhh");
        book.setId(2);
        book.setName("java.book");
        book.setPrice(13.4);
        bookDao.save(book);
    }

    @Test
    void findOne() {
        System.out.println(bookDao.findById(1).toString());
    }

    @Autowired
    MongoTemplate mongoTemplate;
    @Test
    void saveBook3() {
        Book book = new Book();
        book.setAuthor("hhh11");
        book.setId(3);
        book.setName("java.bo1ok");
        book.setPrice(123.4);
        mongoTemplate.save(book);
    }
    @Test
    void tmpFind() {
        System.out.println(mongoTemplate.findById(3, Book.class));
    }
}
