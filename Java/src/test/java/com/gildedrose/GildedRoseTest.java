package com.gildedrose;

import com.gildedrose.item.BackstagePassAFKAL80ETC;
import com.gildedrose.item.Brie;
import com.gildedrose.item.SulfurasHandOfRagnaros;
import com.gildedrose.item.abs.Item;
import com.gildedrose.item.ItemsEnum;
import com.gildedrose.item.UnclassifiedItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new UnclassifiedItem("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.getItems()[0].getName());
    }

    @Test
    void gildedRose_ShouldCreateItemsViaConstructor() {
        Item[] items = new Item[] {
            new Brie(0, 0),
            new BackstagePassAFKAL80ETC(0, 0),
            new SulfurasHandOfRagnaros(0, 0),
        };

        GildedRose app = new GildedRose(items);

        assertEquals(3, app.getItems().length);
        assertContainsItem(app.getItems(), ItemsEnum.AGED_BRIE.getName());
        assertContainsItem(app.getItems(), ItemsEnum.BACKSTAGE_TAFKAL80ETC.getName());
        assertContainsItem(app.getItems(), ItemsEnum.SULFURAS.getName());
    }

    //-- Utils --//

    private void assertContainsItem(Item[] items, String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return;
            }
        }
        fail();
    }
}
