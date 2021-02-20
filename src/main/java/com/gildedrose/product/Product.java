package com.gildedrose.product;

import com.gildedrose.Item;

public abstract class Product {

  protected Item item;

  public Product(Item item){
    this.item = item;
  }

  public void setSellIn(int sellIn) {
    item.sellIn = sellIn;
  }

  public void setQuality(int quality) {
    if(quality < 0){
      item.quality = 0;
    }else if(quality > 50){
      item.quality = 50;
    }else{
      item.quality = quality;
    }
  }

  public abstract void updateSellIn();

  public abstract void updateQuality();

  public void dayLess(){
    updateSellIn();
    updateQuality();
  }

}
