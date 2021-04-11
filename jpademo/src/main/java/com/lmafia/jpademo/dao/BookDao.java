package com.lmafia.jpademo.dao;

import com.lmafia.jpademo.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author L_MaFia
 * @classname BookDao.java
 * @description TODO
 * @date 2021/2/28
 */
public interface BookDao extends JpaRepository<Book, Integer> {

    List<Book> findAllByAuthorAndIdAndName(String author, Integer id, String name);

    @Query(value = "select *  from t_book where id = (select max(id) from t_book)", nativeQuery = true)
    Book findMaxById();
}
