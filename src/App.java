import com.decommer.algorithms.*;

public class App {
    public static void main(String[] args) {

        //Integers
        int[] arr =  {10, 4, 0, 1601, 79, 56, 0, 19, 45, 7, 62, 16, 35, 45};
        // int[] arr = ArrayWork.randomIntArray();
        int[] missingNumArr = {5, 7, 8, 1, 6, 2, 3}; // sum = 32

        System.out.print("Original Array: ");
        ArrayWork.printArray(arr);

        System.out.println("The sum of array is: " + ArrayWork.sumArray(arr));

        System.out.print("Reversed Array: ");
        ArrayWork.printArray(ArrayWork.reverseArray(arr));

        System.out.print("Odd Numbers in the array: ");
        ArrayWork.printArray(ArrayWork.oddInArray(arr)); 

        System.out.println("Min value: " + ArrayWork.minValueInArray(arr));
        System.out.println("Max value: " + ArrayWork.maxValueInArray(arr));
        
        System.out.println("Next Max Value: " + ArrayWork.secondMaxValueInArray(arr)); 
        
        System.out.print("Bubble Sorted Array: ");
        ArrayWork.printArray(Sorting.bubbleSort(arr));
         
        System.out.print("Zeros moved to end: ");
        ArrayWork.printArray(Sorting.moveZerosToEnd(arr));

        System.out.print("Resized array: ");
        ArrayWork.printArray(ArrayWork.resize(arr, 20));

        System.out.print("Find missing number: ");
        ArrayWork.printArray(missingNumArr);
        System.out.print("Missing number is: " + ArrayWork.missingNumber(missingNumArr));
        System.out.println("");

        //Strings
        String word = "civic";
        System.out.printf("Is '%s' a plaindrome? %s", word, StringWork.isPalindrome(word));


    }

}