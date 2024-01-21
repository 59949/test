package com.jingbeifang.fruit.model;

/**
 * 水果类接口
 *
 */
public interface Fruit {


    // 获取水果的id
    Integer getId();

    // 获取水果的名字
    String getName();

    // 获取水果的价格
    double getPrice();

    // 获取水果折扣
    double getDiscount();

    // 设置水果折扣
    double setDiscount(double discount);



}
