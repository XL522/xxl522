package com.itheima.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1={11,22,33,44,55};
        int[] arr2={11,44,22,55,33};
        char[] chars={'a','b','c'};
        System.out.println(Arrays.equals(arr1,arr2));
        //如果元素不存在返回（-(插入点）-1）；
        System.out.println(Arrays.binarySearch(arr2, 44));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(chars));
    }
}
