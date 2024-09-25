
import algorithms.Sorting;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
        int[] arr =  {14, 83, 10, 56, 5, 7, 62, 1, 35};
        System.out.println("Original Array: " + Arrays.toString(arr));


        // //Bubble Sort
        System.out.println("After sort: " + Sorting.bubbleSort(arr));
        
        

    }

}