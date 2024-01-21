package com.jingbeifang.fruit.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟超市中存在的水果
 *
 * @author ming
 *
 */
public class FruitData {

    // 模拟数据库 超市库存存在的水果
    private static Map<Integer, Fruit> fruitMap = new HashMap<>();

    static {
        fruitMap.put(10010, new Apple());
        fruitMap.put(10011, new Strawberry());
        fruitMap.put(10012, new Mango());
    }

    /**
     *  提供方法给超市获取水果
     * @return
     */
    public static Map<Integer, Fruit> getFruitMap() {
        return fruitMap;
    }

}
