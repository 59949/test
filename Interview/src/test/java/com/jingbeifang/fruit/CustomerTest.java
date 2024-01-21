package com.jingbeifang.fruit;

import com.jingbeifang.fruit.model.Fruit;
import com.jingbeifang.fruit.dao.SupperMarket;
import com.jingbeifang.fruit.order.OrderItem;
import com.jingbeifang.fruit.util.CalculateUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试顾客购买水果
 *
 * @author ming
 *
 */
public class CustomerTest {

    /**
     * 现在超市中有3中水果
     * 10010 Apple
     * 10011 Strawberry
     * 10012 Mango
     */
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

        // 模拟顾客的订单列表
        List<OrderItem> orderItemsA = new ArrayList<>();

        // 顾客选择水果
        Fruit apple = supperMarket.getFruit(10010);
        Fruit strawberry = supperMarket.getFruit(10011);

        // 顾客购买水果
        orderItemsA.add(new OrderItem(apple,2));
        orderItemsA.add(new OrderItem(strawberry,3));

        // 超市计算订单价格
        double totalPriceA = supperMarket.calculateTotalPrice(orderItemsA);
        System.out.println("顾客A购买的水果总价为：" + totalPriceA + "元");

        // 验证计算结果的正确性  使用工具类计算
        double finalPriceA = CalculateUtil.calculateOrder(orderItemsA);

        System.out.println("(工具类计算) 顾客A购买的水果总价为：" + finalPriceA + "元");
        System.out.println("两者是否相等：" + (totalPriceA == finalPriceA));

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

        // 模拟顾客的订单列表
        List<OrderItem> orderItemsB = new ArrayList<>();

        // 顾客选择水果
        Fruit apple = supperMarket.getFruit(10010);
        Fruit strawberry = supperMarket.getFruit(10011);
        Fruit mango = supperMarket.getFruit(10012);

        // 顾客购买水果
        orderItemsB.add(new OrderItem(apple,1));
        orderItemsB.add(new  OrderItem(strawberry,2));
        orderItemsB.add(new OrderItem(mango,5));

        // 超市计算订单价格
        double totalPriceB = supperMarket.calculateTotalPrice(orderItemsB);
        System.out.println("顾客A购买的水果总价为：" + totalPriceB + "元");

        // 验证计算结果的正确性  使用工具类计算
        double finalPriceB = CalculateUtil.calculateOrder(orderItemsB);

        System.out.println("(工具类计算) 顾客B购买的水果总价为：" + finalPriceB + "元");
        System.out.println("两者是否相等：" + (totalPriceB == finalPriceB));

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

        // 超市做促销活动，草莓打八折
        supperMarket.fruitDiscount(10011,0.8);

        // 模拟顾客的订单列表
        List<OrderItem> orderItemsC = new ArrayList<>();

        // 顾客选择水果
        Fruit apple = supperMarket.getFruit(10010);
        Fruit strawberry = supperMarket.getFruit(10011);
        Fruit mango = supperMarket.getFruit(10012);

        // 顾客购买水果
        orderItemsC.add(new OrderItem(apple,3));
        orderItemsC.add(new OrderItem(strawberry,4));
        orderItemsC.add(new OrderItem(mango,2));

        // 超市计算订单价格
        double totalPriceC = supperMarket.calculateTotalPrice(orderItemsC);
        System.out.println("顾客C购买的水果总价为：" + totalPriceC + "元");

        // 验证计算结果的正确性  使用工具类计算
        double finalPriceC = CalculateUtil.calculateOrder(orderItemsC);

        System.out.println("(工具类计算) 顾客C购买的水果总价为：" + finalPriceC + "元");
        System.out.println("两者是否相等：" + (totalPriceC == finalPriceC));

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

        // 超市做促销活动，草莓打八折
        supperMarket.fruitDiscount(10011,0.8);

        // 超市增加满减活动  编号1  满100减10
        supperMarket.setDiscountPromotion(1);

        // 模拟顾客的订单列表
        List<OrderItem> orderItemsD = new ArrayList<>();

        // 顾客选择水果
        Fruit apple = supperMarket.getFruit(10010);
        Fruit strawberry = supperMarket.getFruit(10011);
        Fruit mango = supperMarket.getFruit(10012);

        // 顾客购买水果
        orderItemsD.add(new OrderItem(apple,5));
        orderItemsD.add(new OrderItem(strawberry,6));
        orderItemsD.add(new OrderItem(mango,1));

        // 超市计算订单价格
        double totalPriceD = supperMarket.calculateTotalPrice(orderItemsD);
        System.out.println("顾客D购买的水果总价为：" + totalPriceD + "元");

        // 验证计算结果的正确性  使用工具类计算
        double finalPriceD = CalculateUtil.calculateOrderPromotion(orderItemsD,1);

        System.out.println("(工具类计算) 顾客D购买的水果总价为：" + finalPriceD + "元");
        System.out.println("两者是否相等：" + (totalPriceD == finalPriceD));

    }

}
