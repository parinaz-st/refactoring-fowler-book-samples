package com.example.before.p089_extract_method;

import com.example.after.p089_extract_method.Customer;
import com.example.after.p089_extract_method.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {
    private List<com.example.after.p089_extract_method.Order> orders;
    private Date dueDate;
    private com.example.after.p089_extract_method.Customer customer;

    public Invoice() {
        orders = new ArrayList<>();
    }
    public List<com.example.after.p089_extract_method.Order> getOrders() {
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

    public com.example.after.p089_extract_method.Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
