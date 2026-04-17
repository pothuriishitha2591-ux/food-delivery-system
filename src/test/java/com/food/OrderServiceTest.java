package com.food;

import static org.junit.Assert.*;
import org.junit.Test;

public class OrderServiceTest {
    @Test
    public void testOrderSuccess() {
        OrderService service = new OrderService();
        assertEquals("Order Placed: Pizza", service.placeOrder("Pizza", 10.0));
    }

    @Test
    public void testOrderFailure() {
        OrderService service = new OrderService();
        assertEquals("Order Failed", service.placeOrder("Burger", -5.0));
    }
}
