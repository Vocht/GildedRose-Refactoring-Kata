package com.gildedrose.item.strategies;

import com.gildedrose.item.abs.Item;

public class SulfurasStrategy implements QualityStrategy {

    @Override
    public Item updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.increaseQuality(1);
        }

        return item;
    }
}
