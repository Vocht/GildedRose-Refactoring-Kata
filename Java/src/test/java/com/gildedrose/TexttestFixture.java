package com.gildedrose;

import com.gildedrose.item.BackstagePassAFKAL80ETC;
import com.gildedrose.item.Brie;
import com.gildedrose.item.SulfurasHandOfRagnaros;
import com.gildedrose.item.abs.Item;
import com.gildedrose.item.UnclassifiedItem;

public class TexttestFixture {
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new UnclassifiedItem("+5 Dexterity Vest", 10, 20), //
                new Brie(2, 0), //
                new UnclassifiedItem("Elixir of the Mongoose", 5, 7), //
                new SulfurasHandOfRagnaros(0, 80), //
                new SulfurasHandOfRagnaros(-1, 80), //
                new BackstagePassAFKAL80ETC(15, 20), //
                new BackstagePassAFKAL80ETC(10, 49), //
                new BackstagePassAFKAL80ETC(5, 49), //
                new UnclassifiedItem("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
}
