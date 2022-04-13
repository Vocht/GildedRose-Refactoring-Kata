package com.gildedrose.item.abs;

import com.gildedrose.item.strategies.QualityStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Item {
    private String name;
    private int sellIn;
    private int quality;
    private QualityStrategy qualityStrategy;

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void reduceQuality(int amount) {
        if (this.quality > 0) {
            changeQuality(-amount);
        }
    }

    public void increaseQuality(int amount) {
        changeQuality(amount);
    }

    private void changeQuality(int amount) {
        this.quality += amount;
    }

    public void reduceSellIn(int amount) {
        changeSellIn(-amount);
    }

    public void increaseSellIn(int amount) {
        changeSellIn(amount);
    }

    private void changeSellIn(int amount) {
        this.sellIn += amount;
    }

    public void updateQuality() {
        this.qualityStrategy.updateQuality(this);
    }
}
