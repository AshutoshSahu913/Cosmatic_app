package com.example.e_commercecosmaticsellingapp.Model;

public class ModelProduct {
    Integer productId;
    String productName;
    String productQty;
    String productPrice;
    Integer imageUrl;

    public String getProductName() {
        return productName;
    }

    public String getProductQty() {
        return productQty;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public ModelProduct(Integer productId, String productName, String productQty, String productPrice, Integer imageUrl) {
        this.productId = productId;
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
        this.imageUrl = imageUrl;
    }
}
