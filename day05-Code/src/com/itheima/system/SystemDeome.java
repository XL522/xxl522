package com.itheima.system;

public class SystemDeome {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5};
        int[] b=new int[5];
        System.arraycopy(a,0,b,0,5);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
