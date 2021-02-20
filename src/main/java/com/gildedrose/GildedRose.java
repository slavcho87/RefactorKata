package com.gildedrose;

import com.gildedrose.product.ProductFactory;
import com.gildedrose.product.exception.ProductException;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            try{
                ProductFactory.build(items[i]).dayLess();
            }catch (ProductException e){
                System.out.println(e.getMessage());
            }
        }
    }
}