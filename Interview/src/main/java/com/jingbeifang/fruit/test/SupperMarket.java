package com.jingbeifang.fruit.test;

import com.jingbeifang.fruit.model.FruitData;
import com.jingbeifang.fruit.promotion.StrawberryPromotion;

import java.util.Map;

/**
 * 超市
 *
 * @author ming
 *
 */
public class SupperMarket {

    /**
     *  模拟从数据库中获取水果的数据
     *  10010 苹果
     *  10011 草莓
     *  10012 芒果
     */
    private static  Map<Integer,Fruit> fruitData =  FruitData.getFruitMap();

    // 今天超市是否有满减活动 默认为false
    private static Boolean discountPromotion = false;

    // 满减活动， 满 maxNumber 减 minNumber
    private static double maxNumber ;

    private static double minNumber ;


    /**
     * 水果的打折促销活动
     * @param fruitId
     * @param discount
     */
    public void fruitDiscount(int fruitId, double discount) {

        // 草莓打折
        if (fruitId == 10011) {
            StrawberryPromotion strawberryPromotion = new StrawberryPromotion();
            // 打折后的价格
            double newStrawberryPrice = strawberryPromotion.modifyFruitPrice(fruitId, discount);
            Fruit fruit = fruitData.get(fruitId);
            fruit.setPrice(newStrawberryPrice);
            fruitData.put(fruitId, fruit);
        }
    }

    // 设置满减活动 (double A, double B)   满A 减 B
    public void setDiscountPromotion(double oneNumber, double twoNumber) {
        discountPromotion = true;
        maxNumber = oneNumber;
        minNumber = twoNumber;
    }


    /**
     * 计算出顾客购买水果的总金额
     * @return  结果>= 0 表示用户需要付款的总金额   <0 表示输入的参数有误
     */
    public  double calculateTotalPrice(int appleAmount, int strawberryAmount, int mangoAmount ) {

        if (appleAmount < 0 || strawberryAmount < 0 || mangoAmount < 0) {
            System.out.println("输入的参数不合法！");
            return -1.0;
        }

        // 计算购买的苹果的价格
        Apple apple = (Apple) fruitData.get(10010);
        double priceApple = apple.getPrice() * appleAmount;
        // 计算购买的草莓的价格
        Strawberry strawberry = (Strawberry) fruitData.get(10011);
        double priceStrawberry = strawberry.getPrice() * strawberryAmount;
        // 计算购买的芒果的价格
        Mango mango = (Mango) fruitData.get(10012);
        double priceMango =  mango.getPrice() * mangoAmount;

        // 计算顾客购买的水果的总金额
        double totalPrice = priceApple + priceStrawberry + priceMango;

        // 判断是否有满减活动
        if (discountPromotion) {
            if (totalPrice >= maxNumber) {
                totalPrice -= minNumber;
            }
        }

        // 测试完第4个问题时，取消满减活动，避免影响其他问题的测试
        discountPromotion = false;

        return totalPrice;

    }
}
