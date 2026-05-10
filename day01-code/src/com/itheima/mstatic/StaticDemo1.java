package com.itheima.mstatic;

public class StaticDemo1 {
    /*
static 关键字：修饰符，可修改成员变量，成员方法
        1.被类的对象共享
        2.多一种调用方式，可以通过类名调用 Student.school  (推荐类名调用)
        3.随着类的加载而加载，先于对象所存在
        类名调用静态成员的原理   为什么用对象名也可以调用静态成员
     */
    public static void main(String[] args) {
        System.out.println(Student.school);
        Student stu1=new Student();
        stu1.school="西南民大";
        Student stu2=new Student();
        System.out.println(stu2.school);
        stu1.school="西南交大";
        System.out.println(Student.school);

    }
}
