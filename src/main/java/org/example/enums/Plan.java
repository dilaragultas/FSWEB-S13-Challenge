package org.example.enums;

public enum Plan {
    BASIC("Ali", 15);

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    private String name;
    private int price;
}
