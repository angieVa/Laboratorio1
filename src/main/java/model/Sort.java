package model;

import java.util.Arrays;

public class Sort {
	
	private int quantityNumbers;
	private static double[] array;

	public Sort(int quantityNumbers, double rank1, double rank2, int option, int optionRandom) {
		
		this.quantityNumbers = quantityNumbers;
		array = new double[quantityNumbers];
		generateRandom(quantityNumbers, rank1, rank2, option, optionRandom);
		
	}
	
	
	public void generateRandom(int quantity, double rank1, double rank2, int option, int optionRandom) {
		
		if(option == 0) {//repeat
			
			if(optionRandom == 2 ) {
				//random
				generateRandomOption0(quantity, rank1, rank2 );
			
			}else if(optionRandom == 3) {
				//sort
				generateRandomOption0(quantity, rank1, rank2 );
			}else if(optionRandom == 4 ) {
				//sort inverse
				
				
			}else if(optionRandom == 5) {
				//percentage
				
				
			}
		
		}else if(option == 1) { //no repeat
			
			if(optionRandom == 2 ) {
				//random
			
			
			}else if(optionRandom == 3) {
				//sort
				generateRandomOption2(quantity, rank1, rank2);
				
			}else if(optionRandom == 4 ) {
				//sort inverse
				
				
			}else if(optionRandom == 5) {
				//percentage
				
				
			}
			
		}
		
		
	}
	
	public void generateRandomOption0(int quantity, double rank1, double rank2) {
		
		for(int i=0; i<quantity; i++) {
			
			 double random = Math.random()*(rank2-rank1)+rank1;
			 array[i] = random;
			 
			}
		
	}
	
	public void generateRandomOption2(int quantity, double rank1, double rank2) {
		
		for(int i=0; i<quantity; i++) {
			
			 double random = Math.random()*(rank2-rank1)+rank1;
			 array[i] = random;
			 
		}
		
//		shellSort(array);
		mergeSort(array); //mejor con 200.000
		
	}
	
	public void mergeSort(double[] arrayToSort) {
		
		int n = arrayToSort.length;
		 
        // initialize gap
        int gap = n;
 
        // Initialize swapped as true to make sure that
        // loop runs
        boolean swapped = true;
 
        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (gap != 1 || swapped == true)
        {
            // Find next gap
            gap = getNextGap(gap);
 
            // Initialize swapped as false so that we can
            // check if swap happened or not
            swapped = false;
 
            // Compare all elements with current gap
            for (int i=0; i<n-gap; i++)
            {
                if (arrayToSort[i] > arrayToSort[i+gap])
                {
                    // Swap arr[i] and arr[i+gap]
                    double temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+gap];
                    arrayToSort[i+gap] = temp;
 
                    // Set swapped
                    swapped = true;
                }
            }
        }
		
		
	}
	
	
	//This method belongs to the method mergeSort
	public int getNextGap(int gap) {
		
		// Shrink gap by Shrink factor
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
		
	}
	
	public void shellSort(double[] arrayToSort) {
		
	int jump;
	double aux;
	boolean changes;
	
		for(jump= arrayToSort.length/2; jump!=0; jump/=2){
			
			changes=true;
			
		    while(changes){ 
		    	
		    	changes=false;
		    	
		        for(int i=jump; i< arrayToSort.length; i++) {
		        	
		        	if(arrayToSort[i-jump]>arrayToSort[i]){
		        		
		        		aux=arrayToSort[i]; 
		        		arrayToSort[i]=arrayToSort[i-jump];
		                arrayToSort[i-jump]=aux;
		                changes=true; 
		           
		        	}
		                
		          }
		        
		    }
		    
		}
		
	}
	
	public static String prueba() {
		
		return Arrays.toString(array);
		
	}
	
	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) {
		this.array = array;
	}

}
