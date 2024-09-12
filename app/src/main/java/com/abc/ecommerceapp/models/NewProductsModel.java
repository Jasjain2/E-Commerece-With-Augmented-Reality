package com.abc.ecommerceapp.models;

import java.io.Serializable;

public class NewProductsModel implements Serializable {

    String Description;
    String Name;
    String Rating;
    int Price;
    String img_url;
    String applylensebyid;

    public NewProductsModel() {
    }

    public NewProductsModel(String description, String name, String rating, int price, String img_url) {
        Description = description;
        Name = name;
        Rating = rating;
        Price = price;
        this.img_url = img_url;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getApplylensebyid() {
        return applylensebyid;
    }

    public void setApplylensebyid(String applylensebyid) {
        this.applylensebyid = applylensebyid;
    }
}
