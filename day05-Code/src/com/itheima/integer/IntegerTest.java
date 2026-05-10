package com.itheima.integer;

public class IntegerTest {
    public static void main(String[] args) {
        String s="10,50,30,20,40";
        String[] strings=s.split(",");
        int[] a=new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            a[i]=Integer.parseInt(strings[i]);
        }
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max)
                max=a[i];
        }
        System.out.println(max);
    }

}
