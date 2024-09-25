package com.decommer.algorithms;


public class ArrayWork {

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] oddInArray(int[] arr) {
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];

        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
        }
        return arr;
    }

    public static int minValueInArray(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("No data in array");
        }
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }  
        return min;
    }

    public static int maxValueInArray(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("No data in array");
        }
        int max = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int secondMaxValueInArray(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("No data in array");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    

    
}
