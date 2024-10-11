package com.decommer.algorithms.Basic;

import java.util.Arrays;

public class BinarySearch {
    
    public static void binarySearch(int[] arr, int searchValue) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == searchValue) {
                System.out.printf("Value %d found at index %d", searchValue, mid);
                return;
            }else if(arr[mid] < searchValue) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println("Value not found");
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18};
        System.out.println("========= Binary Search =========");
        System.out.println(Arrays.toString(arr));
        binarySearch(arr, 10);
    }
}
