package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasHandOfRagnarosTest {

    @Test
    void updateQuality_shouldUpdateQuality() {
        SulfurasHandOfRagnaros sulfurasHandOfRagnaros = new SulfurasHandOfRagnaros(10, 10);

        sulfurasHandOfRagnaros.updateQuality();

        assertEquals(11, sulfurasHandOfRagnaros.getQuality());
    }
}
