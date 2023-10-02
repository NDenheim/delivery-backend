package com.nology.deliverybackend;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String product_name;
    private String category;
    private double price;

    @Column(length = 500)
    private String image_url;


    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.product_name = name;
        this.category = category;
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return product_name;
    }

    public void setName(String name) {
        this.product_name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }


}
