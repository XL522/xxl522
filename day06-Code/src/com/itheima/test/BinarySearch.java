package com.itheima.test;

public class BinarySearch {
    public static void main(String[] args) {

        int[] a={11,22,33,44,55,66,77,88,99};
        int b=99;
        System.out.println(binarysearch(a,  55));
    }

    private static int binarysearch(int[] a, int b) {
        int max= a.length-1;
        int min=0;
        int mid;

        while (min<=max){
            mid=(max+min)/2;
            if (a[mid]== b){
                return mid;
            } else if (a[mid]< b) {
                 min=mid+1;
            }else if (a[mid]> b){
                max=mid-1;
            }
        }
            return -1;
    }
}
