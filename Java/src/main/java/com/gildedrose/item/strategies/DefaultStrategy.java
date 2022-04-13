package com.gildedrose.item.strategies;

import com.gildedrose.item.abs.Item;

public class DefaultStrategy implements QualityStrategy {
    @Override
    public Item updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.reduceQuality(1);
        }

        item.setSellIn(item.getSellIn() - 1);

        if(item.getQuality() > 0) {
            item.reduceQuality(1);
        }

        return item;
    }
}
