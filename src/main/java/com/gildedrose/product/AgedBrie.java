package com.gildedrose.product;

import com.gildedrose.Item;

public class AgedBrie extends Product{

  public AgedBrie(Item item){
    super(item);
  }

  @Override
  public void updateSellIn() {
    setSellIn(item.sellIn - 1);
  }

  @Override
  public void updateQuality() {
    if (item.sellIn < 0) {
      setQuality(item.quality + 2);
    } else {
      setQuality(item.quality + 1);
    }
  }

}
