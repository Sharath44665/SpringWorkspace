package com.example.demo;

public class Order {
    private String customerName;
    private String productName;
    private int quantity;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //   to auto generate this method:
//    rightclick -> generate -> toString()
    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
