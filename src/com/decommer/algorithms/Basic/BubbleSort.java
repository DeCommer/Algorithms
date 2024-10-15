package com.decommer.algorithms.Basic;

import com.decommer.PrintArray;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        for(int a = 0; a < arr.length; a++) {
            for(int b = 0; b < arr.length - 1; b++) {
                if(arr[b] > arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }return arr;
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
