package com.jingbeifang.fruit.util;

import com.jingbeifang.fruit.order.OrderItem;
import com.jingbeifang.fruit.promotion.DiscountPromotionImpl;

import java.util.List;

/**
 * 工具类计算总金额
 * 验证函数计算的正确性
 * @author ming
 *
 */
public class CalculateUtil {

    static DiscountPromotionImpl discountPromotionImpl = new DiscountPromotionImpl();

    /**
     *  计算客户的订单金额，没有满减活动
     * @param orderItems 顾客订单
     * @return 订单的总金额
     */
    public static double calculateOrder(List<OrderItem> orderItems) {

        // 记录订单的价格
        double finalPrice = 0;
        for (OrderItem orderItem : orderItems) {
            // 获取水果的单价(打折后)
            double fruitPrice = orderItem.getFruit().getPrice() * orderItem.getFruit().getDiscount();
            finalPrice += fruitPrice * orderItem.getAmount();
        }
        return finalPrice;
    }

    /**
     * 计算客户的订单金额，有满减活动
     * @param orderItems 顾客订单
     * @param number 活动编号
     * @return
     */
    public static double calculateOrderPromotion(List<OrderItem> orderItems,int number) {

        double orderPrice = calculateOrder(orderItems);

        // 满减活动
        if (number == 1) {
            orderPrice = discountPromotionImpl.calculateFinalOrderPrice(orderPrice);
        }
        return orderPrice;
    }
}
