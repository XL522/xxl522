package com.itheima.test;

import java.util.Scanner;

public class Regextest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String qq=new String();
        String regex="[1-9]\\d{4,11}";
        String tellRegex="[1][3-9]\\d{9}";
        String emailregex="\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+";
    }
}
