package com.itheima.tools;

public class Test {
    /*
    1.成员方法什么时候加入static
        常用于制作工具类；

    2.工具类：不是描述事物的，是帮我们完成一些工作（打工）

    3.如果发现一个类中的成员方法都被static所修饰
        -私有类的成员方法 目的：不让其他类创建对象，直接用类名调用方法
     */
    public static void main(String[] args) {
        int[] arr={11,22,33};
        System.out.println(ArrayTools.getmax(arr));
        System.out.println(ArrayTools.getmin(arr));
        ArrayTools.printarr(arr);
    }
}
