package com.food;
public class OrderService {
    public String placeOrder(String item, double price) {
        if (price <= 0) return "Order Failed";
        return "Order Placed: " + item;
    }
}
