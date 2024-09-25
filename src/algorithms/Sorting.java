package algorithms;

import java.util.Arrays;

public class Sorting {
    
    public static String bubbleSort(int[] arr) {
        for(int a = 0; a < arr.length; a++) {
            for(int b = 0; b < arr.length - 1; b++) {
                if(arr[b] > arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }return Arrays.toString(arr);
    }
}
