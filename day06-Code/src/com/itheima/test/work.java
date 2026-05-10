package com.itheima.test;

import java.util.Arrays;

public class work {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,};
        int[] b={11,22,33,44,55,66};
        char[] c=new char[]{'a','b','c'};
        System.out.println(""+c);
        System.arraycopy(a,2,b,2,a.length-3);
        System.out.println(Arrays.toString(c));
    }
}
