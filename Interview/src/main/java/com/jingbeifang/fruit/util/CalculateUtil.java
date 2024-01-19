package com.jingbeifang.fruit.util;

/**
 * 手动计算总金额
 *
 * @author ming
 *
 */
public class CalculateUtil {


    public static double calculateFinalPrice(int appleAmount, double applePrice, int strawBerryAmount, double strawBerryPrice,
    double strawBerryDiscount, int mangoAmount, double mangoPrice, double maxNumber , double minNumber) {

        double finalPrice = appleAmount * applePrice + strawBerryAmount * strawBerryPrice * strawBerryDiscount +
                mangoAmount * mangoPrice;

        if (maxNumber > 0) {
            if (finalPrice > maxNumber) {
                finalPrice -= minNumber;
            }
        }

        return finalPrice;
    }
}
