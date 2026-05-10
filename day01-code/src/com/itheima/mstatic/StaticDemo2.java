package com.itheima.mstatic;

public class StaticDemo2 {
    /*
    static 方法中只能访问静态成员变量和静态成员方法（直接访问）
    static 中不允许使用this关键字
     */
    static int a=1;
    int b=2;
    public void p(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}