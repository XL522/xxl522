package com.itheima.mextends;

public class ExtendsDemoe1 {
    /*
    继承：让类与类之间产生父子类关系，子类就可以使用父类中非私有成员
     */
    public static void main(String[] args) {
        Coder c=new Coder();
        c.m();

    }
}
/*
创建类的细节：
        一个java文件中可以编写多个class
        1.保证类与类之间是平级关系
        2.只能有一个被public修饰
 */
class Employee {
     String name="zhnagsan";
    int age;
    double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name = " + name + ", age = " + age + ", salary = " + salary + "}";
    }
}
class Coder extends Employee{
        String name="lisi";
        public void m(){
            System.out.println(name);
            System.out.println(super.name);
        }
}
class Manager extends Employee{

}
