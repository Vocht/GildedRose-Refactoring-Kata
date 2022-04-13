package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackstagePassAFKAL80ETCTest {

    @Test
    void updateQuality_shouldUpdateQuality() {
        BackstagePassAFKAL80ETC backstagePassAFKAL80ETC = new BackstagePassAFKAL80ETC(10, 10);

        backstagePassAFKAL80ETC.updateQuality();

        assertEquals(12, backstagePassAFKAL80ETC.getQuality());
    }

    @Test
    void updateQuality_shouldUpdateQuality_whenQualityIsZero() {
        BackstagePassAFKAL80ETC backstagePassAFKAL80ETC = new BackstagePassAFKAL80ETC(10, 0);

        backstagePassAFKAL80ETC.updateQuality();

        assertEquals(2, backstagePassAFKAL80ETC.getQuality());
    }

    @Test
    void updateQuality_shouldUpdateQuality_whenQualityIsMax() {
        BackstagePassAFKAL80ETC backstagePassAFKAL80ETC = new BackstagePassAFKAL80ETC(10, 50);

        backstagePassAFKAL80ETC.updateQuality();

        assertEquals(50, backstagePassAFKAL80ETC.getQuality());
    }

    @Test
    void updateQuality_shouldUpdateQuality_whenSellInIsZero() {
        BackstagePassAFKAL80ETC backstagePassAFKAL80ETC = new BackstagePassAFKAL80ETC(0, 10);

        backstagePassAFKAL80ETC.updateQuality();

        assertEquals(0, backstagePassAFKAL80ETC.getQuality());
    }

    @Test
    void updateQuality_shouldUpdateQuality_whenSellInIsLessThanZero() {
        BackstagePassAFKAL80ETC backstagePassAFKAL80ETC = new BackstagePassAFKAL80ETC(-1, 10);

        backstagePassAFKAL80ETC.updateQuality();

        assertEquals(0, backstagePassAFKAL80ETC.getQuality());
    }
}
