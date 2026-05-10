package com.itheima.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.divide(bd2,2, RoundingMode.HALF_UP));//四舍五入
        System.out.println(bd1.divide(bd2,2, RoundingMode.UP));//进一法
        System.out.println(bd1.divide(bd2,2, RoundingMode.DOWN));//舍去法
        BigDecimal result = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(Math.abs(result.doubleValue()));
    }
}
