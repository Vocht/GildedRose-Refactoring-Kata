package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnclassifiedItemTest {

    @Test
    void updateQuality_shouldUpdateQuality() {
        UnclassifiedItem item = new UnclassifiedItem("Item", 10, 10);

        item.updateQuality();

        assertEquals(8, item.getQuality());
    }
}
