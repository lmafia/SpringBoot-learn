package com.lmafia.mongodemo.dao;

import com.lmafia.mongodemo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author L_MaFia
 * @classname BookDao.java
 * @description TODO
 * @date 2021/4/18
 */
public interface BookDao extends MongoRepository<Book, Integer> {


}
