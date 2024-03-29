package org.learning.bonus_utility;

import java.math.RoundingMode;
import java.math.BigDecimal;

public class Bonus {
    public static BigDecimal decimalValue(double number){
        // uso della classe bigdecimal per le approssimazioni dei numeri dati
        BigDecimal newNum = new BigDecimal(number);
        BigDecimal numeroArrotondato = newNum.setScale(2, RoundingMode.HALF_UP);
        return numeroArrotondato;
    }


    public static double roundTwoDigits(double number){
        return Math.floor(number * 100.0)/100.0;
    }
}
