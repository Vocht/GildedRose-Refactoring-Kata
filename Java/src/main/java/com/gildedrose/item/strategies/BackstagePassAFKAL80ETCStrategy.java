package com.gildedrose.item.strategies;

import com.gildedrose.item.abs.Item;

public class BackstagePassAFKAL80ETCStrategy implements QualityStrategy {

    @Override
    public Item updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.increaseQuality(1);
        }

        if (item.getSellIn() < 11 && item.getQuality() < 50) {
            item.increaseQuality(1);
        }

        if (item.getSellIn() < 6 && item.getQuality() < 50) {
            item.increaseQuality(1);
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }

        return item;
    }
}
