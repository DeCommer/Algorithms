
import com.decommer.algorithms.*;

public class App {
    public static void main(String[] args) {

        int[] arr =  {10, 4, 79, 56, 19, 7, 62, 16, 35, 45};

        System.out.print("Original Array: ");
        ArrayWork.printArray(arr);

        System.out.print("Reversed Array: ");
        ArrayWork.printArray(ArrayWork.reverseArray(arr));

        System.out.print("Odd Numbers in the array: ");
        ArrayWork.printArray(ArrayWork.oddInArray(arr));

        System.out.print("Bubble Sorted Array: ");
        ArrayWork.printArray(Sorting.bubbleSort(arr));

        System.out.println("Min value: " + ArrayWork.minValueInArray(arr));

        System.out.println("Max Value: " + ArrayWork.maxValueInArray(arr));

    }

}