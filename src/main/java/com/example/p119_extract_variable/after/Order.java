package com.example.p119_extract_variable.after;

public class Order {
    private double quantity;
    private double itemPrice;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double calculatePrice(Order order) {
        double basePrice = order.quantity * order.itemPrice;
        double quantityDiscount = Math.max(0, order.quantity - 500) * order.itemPrice * 0.05;
        double shipping = Math.min(basePrice * 0.1, 100);
        return basePrice -
            quantityDiscount + shipping;
    }
}
