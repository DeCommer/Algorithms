// import algorithms.ArrayStructures;
import algorithms.SortingAlgorithms;

public class App {
    public static void main(String[] args) {

        //+++++++++++++++++++++++++++++++ Array Structures +++++++++++++++++++++++++++++++++++++++++++

        // ArrayStructures newArray = new ArrayStructures();
        // newArray.generateRandomArray();
        
        // System.out.println(newArray.getValueAtIndex(9));
        // System.out.println(newArray.doesArrayContainThisValue(9));

        // newArray.deleteIndex(3);
        // newArray.printArray();

        // newArray.insertValue(9);
        // newArray.printArray();

        // System.out.println("Linear Search");
        // newArray.linearSearchForValue(13);

        //+++++++++++++++++++++++++++++++ Sorting Algorithms +++++++++++++++++++++++++++++++++++++++++++

        SortingAlgorithms sorting = new SortingAlgorithms();
        sorting.generateRandomArray();

        sorting.bubbleSort();
    
    }
}
