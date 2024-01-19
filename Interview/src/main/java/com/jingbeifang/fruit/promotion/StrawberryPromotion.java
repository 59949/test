package com.jingbeifang.fruit.promotion;

import com.jingbeifang.fruit.test.Strawberry;

/**
 * 草莓的促销
 *
 * @author ming
 * @since
 */
public class StrawberryPromotion implements FruitPromotion{

    Strawberry strawberry = new Strawberry();

    /**
     * 计算草莓打折后的价格
     * @param id  哪个水果打折
     * @param newDiscount  打几折
     * @return 打折后的价格
     */
    @Override
    public double modifyFruitPrice(int id, double newDiscount) {
       return strawberry.getPrice() * newDiscount;
    }
}
