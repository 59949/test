package com.jingbeifang.fruit.promotion;

/**
 * 水果促销
 */
public interface FruitPromotion {

     /**
      * 计算水果打折后的价格
      * @param id  哪个水果打折
      * @param newDiscount  打几折
      * @return 打折后的价格
      */
     double modifyFruitPrice(int id, double newDiscount);
}
