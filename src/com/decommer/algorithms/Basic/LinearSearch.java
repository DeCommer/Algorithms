package com.decommer.algorithms.Basic;

import java.util.Arrays;

public class LinearSearch {

    public static void linearSearch(int[] arr, int searchValue){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchValue) {
                System.out.printf("The number %d is at index %d", searchValue, i);
                return;
            }
        }
        System.out.println("Number not found.");
    }
    
    public static void main(String[] args) {
        System.out.println("========= Linear Search =========");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        linearSearch(arr, 5);
    }
}
