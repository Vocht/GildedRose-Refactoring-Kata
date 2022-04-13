package com.gildedrose.item;

import com.gildedrose.item.abs.Item;
import com.gildedrose.item.strategies.DefaultStrategy;

public class UnclassifiedItem extends Item {
    public UnclassifiedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new DefaultStrategy());
    }
}
