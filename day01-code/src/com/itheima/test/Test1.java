package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        Tescher tescher=new Tescher("zhangshan",30);
        Student student=new Student("lisi",15,100);
        tescher.teach();
        student.study();
    }
}
class person{
    String name;
    int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString() {
        return "person{name = " + name + ", age = " + age + "}";
    }
}
class Tescher extends person{

    public Tescher() {
    }

    public Tescher(String name,int age) {
        super(name,age);
    }
    public  void teach(){
        System.out.println("jiaoshu");
    }
}
class Student extends person{
    double scorce=100;

    public Student(double scorce) {
        this.scorce = scorce;
    }

    public Student(String name, int age, double scorce) {
        super(name, age);
        this.scorce = scorce;
    }

    public  void study(){
        System.out.println("study");
    }

}
