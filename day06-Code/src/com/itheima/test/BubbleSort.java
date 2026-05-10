package com.itheima.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={22,55,44,33,11};
        int tepm;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    tepm=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tepm;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
