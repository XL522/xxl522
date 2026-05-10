package com.itheima.test;

import java.util.Arrays;

public class ChoiceSort {
    public static void main(String[] args) {
        int[] arr={22,55,44,33,11};
        int tepm;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]>arr[j]){
                    tepm=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tepm;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] arr1 ={22,55,44,33,11};
        int tepm1;
        int idex;
        for (int i = 0; i < arr1.length-1; i++) {
            idex=i;
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[idex]< arr1[j]){
                    idex=j;

                }
            }
            tepm1 = arr1[i];
            arr1[i]= arr1[idex];
            arr1[idex]= tepm1;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
