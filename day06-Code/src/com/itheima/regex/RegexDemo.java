package com.itheima.regex;

public class RegexDemo {
    public static void main(String[] args) {
        //[]代表单个字符
        String regex="[a-z&&[^df]]";
        String id="1990.11.20.33";
        String regex1="1*";
        System.out.println("b".matches(regex));
        String[] split = id.split("\\.");
        System.out.println("12".matches(regex1));

    }
}
