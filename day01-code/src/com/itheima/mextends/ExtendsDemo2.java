package com.itheima.mextends;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        zi z=new zi();
        z.show();
    }
}
class fu{
    int num=10;
    public void show(){
        System.out.println("fu");
    }
}
class zi extends fu{
    int num=10;
    public void show(){
        System.out.println("zi");
    }
}