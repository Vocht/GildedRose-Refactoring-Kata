package com.gildedrose.item;

import com.gildedrose.item.abs.Item;
import com.gildedrose.item.strategies.BrieStrategy;

public class Brie extends Item {
    public Brie(int sellIn, int quality) {
        super(ItemsEnum.AGED_BRIE.getName(), sellIn, quality, new BrieStrategy());
    }
}
