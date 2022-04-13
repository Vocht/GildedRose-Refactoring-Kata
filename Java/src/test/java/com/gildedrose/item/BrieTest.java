package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrieTest {

    @Test
    void updateQuality_shouldUpdateQuality() {
        Brie brie = new Brie(10, 10);

        brie.updateQuality();

        assertEquals(11, brie.getQuality());
    }

    @Test
    void updateQuality_shouldUpdateQuality_whenQualityIsZero() {
        Brie brie = new Brie(10, 0);

        brie.updateQuality();

        assertEquals(1, brie.getQuality());
    }

    @Test
    void updateQuality_shouldUpdateQuality_whenQualityIs50() {
        Brie brie = new Brie(10, 50);

        brie.updateQuality();

        assertEquals(50, brie.getQuality());
    }

    @Test
    void updateQuality_shouldUpdateQuality_whenQualityIsMoreThan50() {
        Brie brie = new Brie(10, 60);

        brie.updateQuality();

        assertEquals(60, brie.getQuality());
    }

    @Test
    void updateQuality_shouldUpdateQuality_whenSellInIsZero() {
        Brie brie = new Brie(0, 10);

        brie.updateQuality();

        assertEquals(12, brie.getQuality());
    }
}
