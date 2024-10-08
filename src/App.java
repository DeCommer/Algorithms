import com.decommer.algorithms.*;

public class App {
    public static void main(String[] args) {

        // int[] arr =  {10, 4, 0, 1601, 79, 56, 0, 19, 45, 7, 62, 16, 35, 45};
        int[] arr = ArrayWork.randomIntArray();
        // int[] missingNumArr = {5, 7, 9, 1, 6, 2, 3, 8}; // sum = 32
        // int n = 325;
        // int base = 8;
        // int exp = 2;

        System.out.print("Before sort:");
        ArrayWork.printArray(arr);
        System.out.print("After sort: ");
        Sorting.quickSort(arr, 0, arr.length - 1 );
        System.out.print("After sort: ");
        ArrayWork.printArray(arr);

        //Integers
        // System.out.print("Original Array: ");
        // ArrayWork.printArray(arr);

        // System.out.println("The sum of array is: " + ArrayWork.sumArray(arr));

        // System.out.print("Reversed Array: ");
        // ArrayWork.printArray(ArrayWork.reverseArray(arr));

        // System.out.print("Odd Numbers in the array: ");
        // ArrayWork.printArray(ArrayWork.oddInArray(arr)); 

        // System.out.println("Min value: " + ArrayWork.minValueInArray(arr));
        // System.out.println("Max value: " + ArrayWork.maxValueInArray(arr));
        
        // System.out.println("Next Max Value: " + ArrayWork.secondMaxValueInArray(arr)); 
        
        // System.out.print("Bubble Sorted Array: ");
        // ArrayWork.printArray(Sorting.bubbleSort(arr));
         
        // System.out.print("Zeros moved to end: ");
        // ArrayWork.printArray(Sorting.moveZerosToEnd(arr));

        // System.out.print("Resized array: ");
        // ArrayWork.printArray(ArrayWork.resize(arr, 20));

        // System.out.print("Find missing number: ");
        // ArrayWork.printArray(missingNumArr);
        // System.out.print("Missing number is: " + ArrayWork.missingNumber(missingNumArr));
        // System.out.println("");

        // //Strings
        // String word = "civic";
        // System.out.printf("Is '%s' a plaindrome? %s", word, StringWork.isPalindrome(word));
        // System.out.println("");

        // //Recursive Algorithms

        // System.out.printf("%d! = %d", n, Recursion.factorial(7));
        // System.out.println("");
        // System.out.printf("The sum of %d's digits = %d", n, Recursion.sumOfDigits(n));
        // System.out.println("");

        // System.out.printf("%d to the power of %d = %d", base, exp ,Recursion.exponentCalc(base, exp));

        // System.out.println();
        // Searching.binarySearch(arr, 9);

        // DaysAboveAvgTemp.daysAboveAvgTemp();
    }
}