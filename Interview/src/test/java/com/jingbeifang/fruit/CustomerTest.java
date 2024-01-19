package com.jingbeifang.fruit;

import com.jingbeifang.fruit.test.SupperMarket;
import com.jingbeifang.fruit.util.CalculateUtil;
import org.junit.Test;

/**
 * 测试顾客购买水果
 *
 * @author ming
 *
 */
public class CustomerTest {

   SupperMarket supperMarket = new SupperMarket();

    @Test
    public void customerATest() {

    /**
     * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
     * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
     * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     *
     * 假设顾客 A 购买2斤苹果，3斤草莓， 0斤芒果
     */

     double totalPrice = supperMarket.calculateTotalPrice(2,3,0);
     System.out.println("顾客A购买的水果总价为：" + totalPrice + "元");

     // 验证计算结果的正确性  手动计算
     double finalPrice = CalculateUtil.calculateFinalPrice(2, 8, 3, 13, 1, 0,
             20, 0, 0);

     System.out.println("(手动计算) 顾客A购买的水果总价为：" + finalPrice + "元");
     System.out.println("两者是否相等：" + (totalPrice == finalPrice));

    }

    @Test
    public void customerBTest() {

        /**
         * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
         * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         *
         * 假设顾客 B 购买1斤苹果，2斤草莓，5斤芒果
         */
        double totalPrice = supperMarket.calculateTotalPrice(1,2,5);
        System.out.println("顾客B购买的水果总价为：" + totalPrice + "元");

        // 验证计算结果的正确性  手动计算
        double finalPrice = CalculateUtil.calculateFinalPrice(1, 8, 2, 13, 1, 5,
                20, 0, 0);

        System.out.println("(手动计算) 顾客B购买的水果总价为：" + finalPrice + "元");
        System.out.println("两者是否相等：" + (totalPrice == finalPrice));



    }


    @Test
    public void customerCTest() {

        /**
         * 3、超市做促销活动，草莓限时打 8 折。
         * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         *
         * 假设顾客 C 购买3斤苹果，4斤草莓，2斤芒果
         */

        supperMarket.fruitDiscount(10011,0.8);
        double totalPrice = supperMarket.calculateTotalPrice(3,4,2);
        System.out.println("顾客C购买的水果总价为：" + totalPrice + "元");

        // 验证计算结果的正确性  手动计算
        double finalPrice = CalculateUtil.calculateFinalPrice(3, 8, 4, 13, 0.8, 2,
                20, 0, 0);

        System.out.println("(手动计算) 顾客C购买的水果总价为：" + finalPrice + "元");
        System.out.println("两者是否相等：" + (totalPrice == finalPrice));

    }

    @Test
    public void customerDTest() {

        /**
         * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
         * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         * 注意，此时的草莓价格已经打了八折了
         *
         * 假设顾客 D 购买5斤苹果，6斤草莓，1斤芒果
         */

        // 草莓打八折，购物满 100 减 10 块
        supperMarket.fruitDiscount(10011,0.8);
        supperMarket.setDiscountPromotion(100,10);
        double totalPrice = supperMarket.calculateTotalPrice(5,6,1);
        System.out.println("顾客D购买的水果总价为：" + totalPrice + "元");

        // 验证计算结果的正确性  手动计算
        double finalPrice = CalculateUtil.calculateFinalPrice(5, 8, 6, 13, 0.8, 1,
                20, 100, 10);

        System.out.println("(手动计算) 顾客D购买的水果总价为：" + finalPrice + "元");
        System.out.println("两者是否相等：" + (totalPrice == finalPrice));

    }

}
