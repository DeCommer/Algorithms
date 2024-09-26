
import com.decommer.algorithms.*;

public class App {
    public static void main(String[] args) {

        int[] arr =  {10, 4, 0, 79, 56, 0, 19, 45, 7, 62, 16, 35, 45};

        System.out.print("Original Array: ");
        ArrayWork.printArray(arr);

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
    }

}