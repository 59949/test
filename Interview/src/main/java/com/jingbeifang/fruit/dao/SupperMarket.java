package com.jingbeifang.fruit.dao;

import com.jingbeifang.fruit.model.Fruit;
import com.jingbeifang.fruit.model.FruitData;
import com.jingbeifang.fruit.order.OrderItem;
import com.jingbeifang.fruit.promotion.DiscountPromotionImpl;
import com.jingbeifang.fruit.util.CalculateUtil;

import java.util.List;
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
    private static  Map<Integer, Fruit> fruitData =  FruitData.getFruitMap();

    DiscountPromotionImpl discountPromotionImpl = new DiscountPromotionImpl();

    /**
     * 不同的数字代表不同的满减活动
     * 0 没有满减活动
     * 1 满100 减10
     */
    private static int discountPromotion = 0;

    // 模拟根据编号获取超市的水果
    public Fruit getFruit(int fruitId) {
        return fruitData.get(fruitId);
    }

    /**
     * 水果的打折促销活动
     * @param fruitId
     * @param discount
     */
    public void fruitDiscount(int fruitId, double discount) {

            Fruit fruit = fruitData.get(fruitId);
            // 更改水果的折扣
            fruit.setDiscount(discount);
            fruitData.put(fruitId, fruit);
    }

    /**
     * 使用哪种满减活动
     * 不同的数字代表不同的满减活动
     * 0 没有满减活动
     * 1 满100 减10
     * @param number
     */
    public void setDiscountPromotion(int number) {
        discountPromotion = number;

    }

    /**
     * 计算出顾客购买水果的总金额
     * @return  结果>= 0 表示用户需要付款的总金额   <0 表示输入的参数有误
     */
    public  double calculateTotalPrice(List<OrderItem> orderItems) {
        // 调用工具类计算订单的价格
        double orderPrice = CalculateUtil.calculateOrder(orderItems);

        // 判断是否有满减活动，这里只使用了一种满减活动，定死了
        if (discountPromotion == 1) {
            // 调用满减活动的方法
            double finalOrderPrice = discountPromotionImpl.calculateFinalOrderPrice(orderPrice);
            // 返回满减后的价格
            return finalOrderPrice;
        }

        // 测试完第4个问题时，取消满减活动，避免影响其他问题的测试
        discountPromotion = 0;

        return orderPrice;

    }
}
