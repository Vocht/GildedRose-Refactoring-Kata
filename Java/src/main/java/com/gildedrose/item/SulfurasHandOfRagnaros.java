package com.gildedrose.item;

import com.gildedrose.item.abs.Item;
import com.gildedrose.item.strategies.SulfurasStrategy;

public class SulfurasHandOfRagnaros extends Item {
    public SulfurasHandOfRagnaros(int sellIn, int quality) {
        super(ItemsEnum.SULFURAS.getName(), sellIn, quality, new SulfurasStrategy());
    }
}
