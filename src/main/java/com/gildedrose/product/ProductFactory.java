package com.gildedrose.product;

import com.gildedrose.Item;
import com.gildedrose.product.exception.ProductException;

public class ProductFactory {
    private final static String DEXTERITY_VEST = "+5 Dexterity Vest";
    private final static String AGED_BRIE = "Aged Brie";
    private final static String ELIXIR_MONGOOSE = "Elixir of the Mongoose";
    private final static String SULFURAS_HAND_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    private final static String BACKSTAGE_PASSES_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private final static String CONJURED_MANA_CAKE = "Conjured Mana Cake";

    public static Product build(Item item) throws ProductException {
      if(DEXTERITY_VEST.equals(item.name)){
        return new DexterityVest(item);
      }else if(AGED_BRIE.equals(item.name)){
        return new AgedBrie(item);
      }else if(ELIXIR_MONGOOSE.equals(item.name)){
        return new ElixirMongoose(item);
      }else if(SULFURAS_HAND_RAGNAROS.equals(item.name)){
        return new SulfurasHandRagnaros(item);
      }else if(BACKSTAGE_PASSES_TAFKAL80ETC_CONCERT.equals(item.name)){
        return new BackstatePassesConcert(item);
      }else if(CONJURED_MANA_CAKE.equals(item.name)){
        return new ConjuredManaCake(item);
      }else{
        throw new ProductException("Product not exist");
      }
    }

}
