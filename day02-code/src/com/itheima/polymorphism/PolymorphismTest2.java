package com.itheima.polymorphism;

public class PolymorphismTest2 {
    public static void main(String[] args) {
        fu fu=new zi();
        fu.print();
    }
}
interface Inter{
    void method();
}
class InterImpl implements Inter{
    public void method(){
        System.out.println("method");
    }
}
class fu{
    int mun=10;
    public  void show(){
        System.out.println(mun);
    }
    public static void print(){
        System.out.println("fu");
    }
}
class zi extends fu{
    int mun=20;
    public  void show(){
        System.out.println(mun);
    }
    public static void print(){
        System.out.println("zi");
    }
}