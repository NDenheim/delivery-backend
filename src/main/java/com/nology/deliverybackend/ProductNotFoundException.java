package com.nology.deliverybackend;
public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(){
        super("Product has not been found");
    }

}
