package com.gildedrose;

import com.gildedrose.item.Brie;
import com.gildedrose.item.abs.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {
    private Item item;

    @BeforeEach
    void setUp() {
    }

    @Test
    void reduceQuality_shouldReduceQualityByX() {
        item = new Brie(10, 10);

        item.reduceQuality(1);

        assertEquals(9, item.getQuality());
    }

    @Test
    void reduceQuality_shouldIncreaseQualityByX() {
        item = new Brie(10, 10);

        item.increaseQuality(1);

        assertEquals(11, item.getQuality());
    }

    @Test
    void reduceQuality_shouldNotDecreaseQualityBelowZero() {
        item = new Brie(10, 0);

        item.reduceQuality(1);

        assertEquals(0, item.getQuality());
    }

    @Test
    void reduceSellIn_shouldReduceSellInByX() {
        item = new Brie(10, 10);

        item.reduceSellIn(1);

        assertEquals(9, item.getSellIn());
    }

    @Test
    void increaseSellIn_shouldIncreaseSellInByX() {
        item = new Brie(10, 10);

        item.increaseSellIn(1);

        assertEquals(11, item.getSellIn());
    }
}
