package com.decommer.algorithms;

public class Searching {
    
    public static void linearSearch(int[] arr,int searchValue) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchValue) {
                System.out.printf("Value %d was found at index %d", searchValue, i);
                return;
            }
        }
        System.out.println("Value not found");
    }

    public static void binarySearch(int[] arr, int searchValue) {
        int leftPointer = 0; //Start of array
        int rightPointer = arr.length - 1; // End of array

        while(leftPointer <= rightPointer) {
            int midPointer = (leftPointer + rightPointer) / 2;

            if(arr[midPointer] == searchValue) {
                System.out.printf("The value %d was found", midPointer);
                return;
            }else if(arr[midPointer] < searchValue) {
                leftPointer = midPointer + 1;
            }else {
                rightPointer = midPointer - 1;
            }
        }
    }
}
