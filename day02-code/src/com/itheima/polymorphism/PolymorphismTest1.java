package com.itheima.polymorphism;
public class PolymorphismTest1 {
    public static void main(String[] args) {
        useanimal(new Dog());
        useanimal(new Cat());
    }
    public static void useanimal(Animal animal){
        animal.eat();
    }
}

abstract class Animal{
    abstract public void eat();
}
class Dog extends Animal{
    public void eat(){
        System.out.println("gouchirou");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("maochiyu");
    }
}
