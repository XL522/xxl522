package com.itheima.object;

import java.util.ArrayList;

public class ToStringDemoe {
    /*
    * public String toString():
    *         */
    public static void main(String[] args) {
        Student a=new Student("张三",11);
        ArrayList<String> strings=new ArrayList<>();
        System.out.println(strings);
        System.out.println(a.toString());
        System.out.println(a);

    }
}
