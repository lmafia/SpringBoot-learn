package com.lmafia.jpademo;

import com.lmafia.jpademo.bean.Book;
import com.lmafia.jpademo.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpademoApplicationTests {

    @Autowired
    BookDao bookDao;

    @Test
    void contextLoads() {
        Book book = new Book();
        book.setName("三国演义1");
        book.setAuthor("罗贯中1");

        bookDao.save(book);

    }
    @Test
    void test1() {
        List<Book> bookByAuthorIdName = bookDao.findAllByAuthorAndIdAndName("sda",1,"231");
        System.out.println(bookByAuthorIdName);
//        List<Book> all = bookDao.findAll();
//        all.forEach(book -> {book.setAuthor("连凯业1");bookDao.saveAndFlush(book);});

        Book maxById = bookDao.findMaxById();
        System.out.println(maxById);
    }
    @Test
    void test2() {
        bookDao.deleteById(1);
    }
    @Test
    void findTest1() {
        List<Book> all = bookDao.findAll(Sort.by(Sort.Direction.DESC, "id"));
        System.out.println(all);
    }
    @Test
    void findPage() {
        Pageable pageable = PageRequest.of(1,2);
        Page<Book> page = bookDao.findAll(pageable);
        System.out.println("总记录数：" + page.getTotalElements());
        System.out.println("总页数：" + page.getTotalPages());
        System.out.println("每一页记录数" + page.getSize());
            System.out.println("当前页记录数" + page.getNumberOfElements());
            System.out.println("当前页数" + page.getNumber());
            System.out.println("查询结果" + page.getContent());



    }
}
