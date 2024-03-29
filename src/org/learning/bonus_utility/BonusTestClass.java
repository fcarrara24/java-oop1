package org.learning.bonus_utility;

import java.math.BigDecimal;

public class BonusTestClass {
    public static void main(String[] args) {
        double number = 10.0 /3;
        BigDecimal newNumber= Bonus.decimalValue(number);
        double thirdNum = Bonus.roundTwoDigits(number);
        System.out.println(
                "old: "+number+"\n" +
                "new: "+newNumber+"\n" +
                "mine:"+thirdNum);
    }


}
