package com.jingbeifang.fruit.test;

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

    // 修改水果的价格
    Double setPrice(Double newPrice);



}
