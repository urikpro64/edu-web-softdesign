package com.solfwaredesign.projectedu.product;

public class ProductResponse {
    private int id;
    private String name;
    private int price;
    private String date;

    public ProductResponse(int id, String name, int price, String date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;    
    }
}
