package com.jingbeifang.fruit.model;

/**
 * 苹果类
 *
 * @author ming
 *
 */
public class Apple implements Fruit{

    // 苹果的Id
    private Integer id = 10010;

    // 苹果的名字
    private String name = "苹果";

    // 苹果的初始价格 8.0元/斤
    private double price = 8.0;

    // 苹果的初始折扣
    private double discount = 1.0;

    // 全参构造方法
    public Apple(Integer id, String name, Double price, Double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // 无参构造方法
    public Apple() {
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
    public double getDiscount() {
        return this.discount;
    }

    @Override
    public double setDiscount(double discount) {
        return this.discount = discount;
    }




}
