package com.solfwaredesign.projectedu.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("products")
public class Product {

    @Transient
    public static final String SEQUENCE_NAME = "products_sequence";
    @Id
    private long id;
    private String name;
    private long price;
    private Date date;

    private long userId; // created by

    public Product(String name, int price) {
        super();
        this.name = name;
        this.price = price;
        this.date = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;    
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString(){
        return String.format(
                "Product[id=%s, name='%s', price='%s', date='%s]", id, name, price, date);
    }
}
