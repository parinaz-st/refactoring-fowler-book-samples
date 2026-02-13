package com.example.p106_extract_method.after;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {
    private List<Order> orders;
    private Date dueDate;
    private Customer customer;

    public Invoice() {
        orders = new ArrayList<>();
    }
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
