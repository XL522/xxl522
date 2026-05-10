package com.itheima.mextends;

public class extendsDemo3 {
    /*
    方法重载（overload）：在同一个类中方法名相同，参数不同，与返回值无关
    方法重写（override）：在子父类当中，出现了方法声明一模一样的方法（方法名，参数，返回值）
            识别方法是不是重写：@Override
            使用场景：子类需要父类的方法，但是觉得逻辑不好，需要修改|增强
    注意事项：父类私有的方法不能重写
            权限修饰符必须大于等于父类
     */
    public static void main(String[] args) {

    }
}
class  father{
    public void method(){
        System.out.println("father");
    }
}
class son extends father{
    @Override
    public void method(){
        super.method();
        System.out.println("son");
    }
}
