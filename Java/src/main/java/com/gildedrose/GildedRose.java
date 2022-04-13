package com.gildedrose;

import com.gildedrose.item.abs.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
class GildedRose {
    private Item[] items;

    public void updateQuality() {
        Arrays.stream(items).forEach(Item::updateQuality);
    }
}
