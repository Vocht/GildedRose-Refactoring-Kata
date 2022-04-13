package com.gildedrose.item;

import com.gildedrose.item.abs.Item;
import com.gildedrose.item.strategies.BackstagePassAFKAL80ETCStrategy;

public class BackstagePassAFKAL80ETC extends Item {
    public BackstagePassAFKAL80ETC(int sellIn, int quality) {
        super(ItemsEnum.BACKSTAGE_TAFKAL80ETC.getName(), sellIn, quality, new BackstagePassAFKAL80ETCStrategy());
    }
}
