package com.decommer.algorithms.Basic;

import com.decommer.PrintArray;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int k = arr[i];
            int j =i - 1;
            while(j >=0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = k;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 13, 5, 1, 19, 17, 3, 15, 11, 9};
        System.out.println("========= Insertion Sort =========");

        System.out.println("Before sort");
        PrintArray.printArray(arr);
        insertionSort(arr);
        System.out.println("After sort");
        PrintArray.printArray(arr);

        
    }
}
