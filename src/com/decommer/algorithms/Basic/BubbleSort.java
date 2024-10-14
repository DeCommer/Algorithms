package com.decommer.algorithms.Basic;

import com.decommer.PrintArray;

public class BubbleSort {

    public static void bubbleSwap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swp;
        for(int i = 0; i < n - 1; i++) {
            swp = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    bubbleSwap(arr, i, j);
                    swp = true;
                }
            }
            if(!swp) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 13, 5, 1, 19, 17, 3, 15, 11, 9};
        System.out.println("========= Bubble Sort =========");
        System.out.print("Before: ");
        PrintArray.printArray(arr);
        System.out.print("After : ");
        bubbleSort(arr);
        PrintArray.printArray(arr);
    }
}
