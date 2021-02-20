package com.gildedrose.product;

import com.gildedrose.Item;

public class BackstatePassesConcert extends Product{

  public BackstatePassesConcert(Item item){
    super(item);
  }

  public void updateSellIn() {
    setSellIn(item.sellIn - 1);
  }

  @Override
  public void updateQuality() {
    if (item.sellIn < 0) {
      setQuality(0);
    } else if (item.sellIn < 5) {
      setQuality(item.quality + 3);
    } else if (item.sellIn < 10) {
      setQuality(item.quality + 2);
    }else{
      setQuality(item.quality + 1);
    }
  }

}
