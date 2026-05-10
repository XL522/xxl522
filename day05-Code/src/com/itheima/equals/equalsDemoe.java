package com.itheima.equals;

import com.itheima.object.Student;

import java.util.ArrayList;
import java.util.Objects;

public class equalsDemoe {
    public static void main(String[] args) {
        Student stu1=null;//new Student("张三",12);
        Student stu2=new Student("张三",12);
        //System.out.println(stu1.equals(stu2));

        System.out.println(Objects.equals(stu1, stu2));
    }
}
