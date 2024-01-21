package com.jingbeifang.fruit.promotion;

/**
 * 折扣的实现类
 *
 * @author ming
 */
public class DiscountPromotionImpl implements DiscountPromotion {
    /**
     * 计算满减后的价格  满A 减 B
     * @param orderPrice 满减前的订单价格
     * @return 满减后的订单价格
     */
    @Override
    public double calculateFinalOrderPrice(double orderPrice) {
        // 满100 减 10
        double maxNumber = 100;
        double minNumber = 10;
        // 判断金额是否符合满减条件
        if (orderPrice >= maxNumber) {
            orderPrice -= minNumber;
            return orderPrice;
        }
        return orderPrice;
    }
}
