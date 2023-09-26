package com.example.e_commercecosmaticsellingapp.Model;

public class ModelCategory {
    Integer productId;
    String productName;

    public String getProductName() {
        return productName;
    }

    public ModelCategory(Integer productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}
