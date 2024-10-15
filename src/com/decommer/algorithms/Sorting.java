package com.decommer.algorithms;

public class Sorting {

    public static int[] moveZerosToEnd(int[] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }
    
    public static int[] mergeSort(int[] arr) {
        //coming soon
        return arr;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(arr != null && arr.length <= 1) {
            return;
        }
        if( start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        for(int j = start + i; j <= end; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, start, i);
        return i;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
