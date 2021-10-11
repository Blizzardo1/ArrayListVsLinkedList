package com.toasternetwork.examples;

public class Item implements Cloneable{
    private String name;
    private String desc;
    private int qty;
    private double price;

    public Item(String name, String description, int quantity, double price) {
        this.name = name;
        this.desc = description;
        this.qty = quantity;
        this.price = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return desc;
    }

    public void setDescription(String desc) {
        this.desc = desc;
    }

    public int getQuantity() {
        return qty;
    }

    public void setQuantity(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
