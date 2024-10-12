package com.decommer.algorithms.Basic;

/*
Uses a loop to iterate through the array.
For each position in the array, it finds the minimum element in the unsorted portion.
Swaps the found minimum element with the element at the current position.
 */

public class SelectionSort {

    public static void printArr(int[] arr) {
        for(int n : arr) {
            System.out.print(n + ", ");
        }
        System.out.println();
    }
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if(minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }

    public static void main(String[] arr) {
        int[] array = {7, 13, 5, 1, 19, 17, 3, 15, 11, 9};
        System.out.println("========= Selection Sort =========");
        System.out.print("Before: ");
        printArr(array);
        System.out.print("After : ");
        selectionSort(array);
        printArr(array);
    }

}
