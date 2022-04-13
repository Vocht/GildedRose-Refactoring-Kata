package com.gildedrose.item;

public enum ItemsEnum {
    AGED_BRIE("Aged Brie"),
    BACKSTAGE_TAFKAL80ETC("Backstage passes to a TAFKAL80ETC concert"),
    SULFURAS("Sulfuras, Hand of Ragnaros");

    private final String name;

    ItemsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
