package com.jingbeifang.fruit.test;

/**
 * 芒果类
 *
 * @author ming
 *
 */
public class Mango implements Fruit{
    // 芒果的Id
    private Integer id = 10012;

    // 芒果的名字
    private String name = "芒果";

    // 芒果的初始价格 20.0元/斤
    private double price = 20.0;

    // 芒果的初始折扣
    private double discount = 1.0;

    // 全参构造方法
    public Mango(Integer id, String name, Double price, Double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // 无参构造方法
    public Mango() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Double setPrice(Double newPrice) {
        return this.price = newPrice;
    }


}
