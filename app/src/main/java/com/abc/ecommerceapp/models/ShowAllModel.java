package com.abc.ecommerceapp.models;

import java.io.Serializable;

public class ShowAllModel implements Serializable {

    String Description;
    String Name;
    String Rating;
    int Price;
    String img_url;
    String type;

    String applylensebyid;

    public ShowAllModel() {
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        this.Rating = rating;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getApplylensebyid() {
        return applylensebyid;
    }

    public void setApplylensebyid(String applylensebyid) {
        this.applylensebyid = applylensebyid;
    }


    public ShowAllModel(String description, String name, String rating, int price, String img_url, String type, String applylensebyid) {
        this.Description = description;
        this.Name = name;
        this.Rating = rating;
        this.Price = price;
        this.img_url = img_url;
        this.type = type;
        this.applylensebyid = applylensebyid;
    }
}
