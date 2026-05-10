package com.itheima.integer;

public class IntegerView {
    public static void main(String[] args) {
        //-128--127;
        Integer i1=127;
        Integer i2=127;
        System.out.println(i1==i2);

        Integer i3=130;
        Integer i4=130;
        System.out.println(i3.equals(i4));
    }
}
