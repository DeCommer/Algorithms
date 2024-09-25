
import com.decommer.algorithms.*;

public class App {
    public static void main(String[] args) {

        int[] arr =  {10, 4, 79, 56, 19, 7, 62, 1, 35};

        System.out.print("Original Array: ");
        ArrayWork.printArray(arr);

        int[] reversed = ArrayWork.reverseArray(arr);
        System.out.print("Reversed Array: ");
        ArrayWork.printArray(reversed);

        int[] res = ArrayWork.oddInArray(arr);
        System.out.print("Odd Numbers in the array: ");
        ArrayWork.printArray(res);

        int[] bubbleSorted = Sorting.bubbleSort(arr);
        System.out.print("Bubble Sorted Array: ");
        ArrayWork.printArray(bubbleSorted);



    }

}