package algorithms;

public class SortingAlgorithms {

    ArrayStructures as = new ArrayStructures();
    
    public void generateRandomArray(){
		for(int i = 0; i < as.getArraySize(); i++){
			as.getTheArray()[i] = (int)(Math.random()*10)+10;
		}
	}

    // This bubble sort will sort everything from 
		// smallest to largest
		
		public void bubbleSort(){
			
			// i starts at the end of the Array
			// As it is decremented all indexes greater
			// then it are sorted
			
			for(int i = as.getArraySize() - 1; i > 1; i--){
				
				// The inner loop starts at the beginning of 
				// the array and compares each value next to each 
				// other. If the value is greater then they are 
				// swapped
				
				for(int j = 0; j < i; j++){
					
					// To change sort to Descending change to <
					
					if(as.getTheArray()[j] > as.getTheArray()[j + 1]){
						
						swapValues(j, j+1);
						
						as.printHorzArray(i, j);
						
					}
					
				}
				
			}
			
		}
		
		public void swapValues(int indexOne, int indexTwo){
			
			int temp = as.getTheArray()[indexOne];
			as.getTheArray()[indexOne] = as.getTheArray()[indexTwo];
			as.getTheArray()[indexTwo] = temp;
			
		}
		
		
		// The Binary Search is quicker than the linear search
		// because all the values are sorted. Because everything
		// is sorted once you get to a number larger than what
		// you are looking for you can stop the search. Also
		// you be able to start searching from the middle 
		// which speeds the search. It also works best when 
		// there are no duplicates
		
		public void binarySearchForValue(int value){
			
			int lowIndex = 0;
			int highIndex = as.getArraySize() - 1;
			
			while(lowIndex <= highIndex){
				
				int middleIndex = (highIndex + lowIndex) / 2;
				
				if(as.getTheArray()[middleIndex] < value) lowIndex = middleIndex + 1;
				
				else if(as.getTheArray()[middleIndex] > value) highIndex = middleIndex - 1;
				
				else {
					
					System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
					
					lowIndex = highIndex + 1;
					
				}
				
				as.printHorzArray(middleIndex, -1);
				
			}
			
		}
		
		// Selection sort search for the smallest number in the array
		// saves it in the minimum spot and then repeats searching
		// through the entire array each time
		
		public void selectionSort(){
			
			for(int x=0; x < as.getArraySize(); x++){
				  int minimum = x;
				  
				  for(int y=x; y < as.getArraySize(); y++){
				  
					  // To change direction of sort just change 
					  // this from > to <
					  
					  if(as.getTheArray()[minimum]>as.getTheArray()[y]){
						  minimum = y;
					  }
				  }
				  
				  swapValues(x, minimum);
				  
				  as.printHorzArray(x, -1);
			}
			
		}
		
		// The Insertion Sort is normally the best of 
		// the elementary sorts. Unlike the other sorts that
		// had a group sorted at any given time, groups are
		// only partially sorted here.
		
		public void insertionSort(){
			
			for (int i = 1; i < as.getArraySize(); i++){
				  int j = i;
				  int toInsert = as.getTheArray()[i];
				  while ((j > 0) && (as.getTheArray()[j-1] > toInsert)){
					  as.getTheArray()[j] = as.getTheArray()[j-1];
					  j--;
					  
					  as.printHorzArray(i, j);
					  
				  }
				  as.getTheArray()[j] = toInsert;
				  
				  as.printHorzArray(i, j);
				  
				  System.out.println("\nArray[i] = " + as.getTheArray()[i] + " Array[j] = " + as.getTheArray()[j] + " toInsert = " + toInsert + "\n");
				  
			}
			
		}
}
