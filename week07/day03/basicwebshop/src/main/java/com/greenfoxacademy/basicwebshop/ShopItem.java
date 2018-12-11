package com.greenfoxacademy.basicwebshop;

public class ShopItem {
    private String name;
    private String description;
    private int price;
    private int stocknr;

    public ShopItem(String name, String description, int price, int stocknr) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stocknr = stocknr;
    }

    public ShopItem() {

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStockNr() {
        return stocknr;
    }
}
