package com.lmafia.mongodemo.model;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @author L_MaFia
 * @classname Book.java
 * @description TODO
 * @date 2021/4/18
 */

public class Book {
    private String name;
    private Integer id;
    private String author;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
