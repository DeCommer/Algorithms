import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
        int[] arr =  {15, 83, 21, 56, 5, 7, 67, 1, 35};

        System.out.println("Before sort " +  Arrays.toString(arr));
    

        System.out.println("After sort: " + bubbleSort(arr));

    }

    public static String bubbleSort(int[] arr) {

        for(int a = 0; a < arr.length; a++) {

            for(int b = 0; b <  arr.length - 1; b++) {

                if(arr[b] > arr[b + 1]) {
                    int temp = arr[a];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}