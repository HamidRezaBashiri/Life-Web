package com.example.lifeweb.model;

public class Products {
    private String product_name;
    private int id;
    private String price;
    private String image_url;
    private Boolean off;
    private String description;

    public Products(String product_name, int id, String price, String image_url, Boolean off, String description) {
        this.product_name = product_name;
        this.id = id;
        this.price = price;
        this.image_url = image_url;
        this.off = off;
        this.description = description;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Boolean getOff() {
        return off;
    }

    public void setOff(Boolean off) {
        this.off = off;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
