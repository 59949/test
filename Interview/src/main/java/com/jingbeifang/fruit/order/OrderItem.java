package com.jingbeifang.fruit.order;

import com.jingbeifang.fruit.model.Fruit;

/**
 * 订单类
 * 模拟顾客购买的订单
 * @author ming
 */
public class OrderItem {

    // 顾客购买的水果
    private Fruit fruit;
    // 顾客购买的水果数量 /斤
    private int amount;

    public OrderItem(Fruit fruit, int amount) {
        this.fruit = fruit;
        this.amount = amount;
    }

    public OrderItem() {
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
