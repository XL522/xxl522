package com.itheima.minterface;

public class InterfaceTesr1 {
    public static void main(String[] args) {
        InterImpl i1=new InterImpl();
        i1.method();
        i1.show();
    }
}
interface inter{
    abstract public void show();
    abstract public void method();
}
class InterImpl implements inter{

    @Override
    public void show() {
        System.out.println("show");
    }
    @Override
    public void method() {
        System.out.println("method");
    }
}
abstract class InterImpl2 implements inter{
    abstract public void show();
    abstract public void method();
}