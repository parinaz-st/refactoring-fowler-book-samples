package com.example.p119_extract_variable.after;

/**
 * If a variable is used repeatedly or conceptually belongs to the object,
 * turn it into a query method.
 */
public class Order2 {
    private double quantity;
    private double itemPrice;

    public double getQuantity() {
        return quantity;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getBasePrice() {
        return this.quantity * this.itemPrice;
    }

    public double getQuantityDiscount() {
        return Math.max(0, this.quantity - 500) * this.itemPrice * 0.05;
    }

    public double getShipping() {
        return Math.min(getBasePrice() * 0.1, 100);
    }

    public double getPrice() {
        return getBasePrice() - getQuantityDiscount() + getShipping();
    }
}
