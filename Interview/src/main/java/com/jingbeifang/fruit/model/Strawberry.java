package com.jingbeifang.fruit.model;

/**
 * 草莓类
 *
 * @author ming
 *
 */
public class Strawberry implements Fruit{
    // 草莓的Id
    private Integer id = 10011;

    // 草莓的名字
    private String name = "草莓";

    // 草莓的初始价格 13.0元/斤
    private double price = 13.0;

    // 草莓的初始折扣
    private double discount = 1.0;

    // 全参构造方法
    public Strawberry(Integer id, String name, Double price, Double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // 无参构造方法
    public Strawberry() {
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
