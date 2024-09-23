public class ArrayStructures {

    private int [] theArray = new int[50];

    private int arraySize = 10;

    public void howToGenerateRandomArray() {
        for(int i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void howToPrintArray() {
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public int howToGetValueAtIndex(int index) {
        if(index < arraySize) {
            return theArray[index];
        }
        return 0;
    }

    public boolean howToSeeIfArrayContainsValue(int searchValue) {

        boolean valueInArray = false;
        
        for(int i = 0; i < arraySize; i++) {
            if(theArray[i] == searchValue) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void howToDeleteAndMoveUp(int index) {
        if(index < arraySize) {
            for(int i = index; i < (arraySize - 1); i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public void howToInsertValues(int value){
        if(arraySize < 50) {
            theArray[arraySize] = value;
        }
        arraySize++;
    }

    public static void main(String[] args) throws Exception {
        ArrayStructures newArray = new ArrayStructures();

        newArray.howToGenerateRandomArray();
        newArray.howToPrintArray();

        // System.out.println(newArray.howToGetValueAtIndex(9));

        // System.out.println(newArray.howToSeeIfArrayContainsValue(9));

        // newArray.howToDeleteAndMoveUp(3);
        // newArray.howToPrintArray();

        newArray.howToInsertValues(9);
        newArray.howToPrintArray();
    }
}
