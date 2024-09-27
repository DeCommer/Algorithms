package com.decommer.algorithms;

public class ArrayWork {

    public static int[] randomIntArray() {
		int randLength = (int)(Math.random() * 9) + 1;
		int[] randomArray = new int[randLength];
		for(int i = 0; i < randomArray.length; i++) {
			int randValue = (int)(Math.random() * 99);
			randomArray[i] = randValue;
		}
		return randomArray;
	}

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int sumArray(int[] arr) {
        int arrSum = 0;
        for(int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return arrSum;
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

    public static int[] resize(int[] arr, int newSize) { //pass by value
        int[] tempArr = new int[newSize];
        for(int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        return tempArr;
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int arrSum = n * (n + 1) / 2;
        for(int i = 0; i < arr.length; i++) {
            arrSum -= arr[i];
        }
        return arrSum;
    }
}
