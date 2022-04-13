package com.gildedrose.item.strategies;

import com.gildedrose.item.abs.Item;

public class BrieStrategy implements QualityStrategy {

    @Override
    public Item updateQuality(Item item) {
        item.reduceSellIn(1);

        if (item.getQuality() < 50) {
            item.increaseQuality(1);
        }

        if (item.getSellIn() < 0 && item.getQuality() < 50) {
            item.increaseQuality(1);
        }

        return item;
    }
}
