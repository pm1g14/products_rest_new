package com.algomi.interview.domain;

public class Item {
    public enum ItemType {
        Food, Clothing, DVD
    }

    private final String name;
    private final ItemType type;
    private final float price;

    public Item(String name, ItemType type, float price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public ItemType type() {
        return type;
    }

    public float price() {
        return price;
    }
}
