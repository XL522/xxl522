package com.itheima.object;

public class Student {
    String name;
    int age;

    public Student() {
    }

    @Override

    public boolean equals(Object obj) {
        //this:stu1
        //obj:stu2
        if (obj instanceof Student){
            Student stu=(Student) obj;
            return this.age==stu.age&&
                    this.name.equals(stu.name);
        }else {
            return false;
        }

    }

    @Override
    public String  toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
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
}
