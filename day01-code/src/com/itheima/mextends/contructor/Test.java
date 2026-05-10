package com.itheima.mextends.contructor;

public class Test {
    public static void main(String[] args) {
        zi z=new zi();
        zi z1=new zi(10);
    }
}
class fu{
     int num=10;
    public fu(){
        System.out.println("fu");
    }
    public fu(int mun){
        System.out.println("fu2");
    }
}
class zi extends fu{
    int num=20;
    public zi(){
        System.out.println("zi");
    }
    public zi (int mun){
        System.out.println("zi2");
    }
    public void methd(){
        //this:调用本类成员 super：调用父类成员 就近原则
        int num=30;
        System.out.println(num);//30
        System.out.println(this.num);//20
        System.out.println(super.num);//10
    }
}