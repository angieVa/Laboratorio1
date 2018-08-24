package model;

import java.util.Arrays;

public class Sort {
	
	private int quantityNumbers;
	private static double[] array;

	public Sort(int quantityNumbers, double rank1, double rank2, int option, int optionRandom, double percentage) {
		
		this.quantityNumbers = quantityNumbers;
		array = new double[quantityNumbers];
		generateRandom(quantityNumbers, rank1, rank2, option, optionRandom, percentage);
		
	}
	
	
	public void generateRandom(int quantity, double rank1, double rank2, int option, int optionRandom, double percentage) {
		
		if(option == 0) {//repeat
			
			if(optionRandom == 1 ) {
				//random
				generateRandomOption1(quantity, rank1, rank2, option);
			
			}else if(optionRandom == 2) {
				//sort
				generateRandomOption2(quantity, rank1, rank2, option);
				
			}else if(optionRandom == 3 ) {
				//sort inverse
				generateRandomOption3(quantity, rank1, rank2, option);
				
			}else if(optionRandom == 4) {
				//percentage
				generateRandomOption4(quantity, rank1, rank2, option, percentage);
				
			}
		
		}else if(option == 1) { //no repeat
			
			if(optionRandom == 1 ) {
				//random
			
				generateRandomOption1(quantity, rank1, rank2, option);
			
			}else if(optionRandom == 2) {
				//sort
			
				generateRandomOption2(quantity, rank1, rank2, option);
				
			}else if(optionRandom == 3 ) {
				//sort inverse
				
				generateRandomOption3(quantity, rank1, rank2, option);
				
			}else if(optionRandom == 4) {
				//percentage
				
				generateRandomOption4(quantity, rank1, rank2, option, percentage);
				
			}
			
		}
		
		
	}
	
	public void investArray(double[] arrayToSort) {
		
		double aux;
		
		 for (int i=0; i<arrayToSort.length/2; i++) {
	            aux = arrayToSort[i];
	            arrayToSort[i] = arrayToSort[arrayToSort.length-1-i];
	            arrayToSort[arrayToSort.length-1-i] = aux;
	        }
		
	}
	
	public void generateRandomOption1(int quantity, double rank1, double rank2, int option) {
	
		if(option == 0) {
		
			for(int i=0; i<quantity; i++) {
				
				 double random = Math.random()*(rank2-rank1)+rank1;
				 array[i] = random;
				 
			}
		}
		
		else {
			
			for(int i=0; i<quantity; i++) {
				
				 double random = Math.random()*(rank2-rank1)+rank1;
				 array[i] = random;
				 
			}
			
			checkRepetition(quantity, array, rank1, rank2);
			
		}
	}
	
	public void generateRandomOption2(int quantity, double rank1, double rank2, int option) {
		
		if(option == 0) {
		
			for(int i=0; i<quantity; i++) {
				
				 double random = Math.random()*(rank2-rank1)+rank1;
				 array[i] = random;
				 
			}
			
			
			if(quantity <= 500) {
				
				insertionSort(array);
				
			} else if(quantity > 500 && quantity <= 100000) {
				
				combSort(array);	
				
			} else {
				
				shellSort(array);
				
			}
			
			 
		}
		
		else {
			
			for(int i=0; i<quantity; i++) {
				
				 double random = Math.random()*(rank2-rank1)+rank1;
				 array[i] = random;
				 
			}
			
			checkRepetition(quantity, array, rank1, rank2);
			
			if(quantity <= 500) {
				
				insertionSort(array);
				
			} else if(quantity > 500 && quantity <= 100000) {
				
				combSort(array);	
				
			} else {
				
				shellSort(array);
				
			}

			
		}
	}
	
	public void generateRandomOption3(int quantity, double rank1, double rank2, int option) {
		
		if(option == 0) {
		
			for(int i=0; i<quantity; i++) {
				
				 double random = Math.random()*(rank2-rank1)+rank1;
				 array[i] = random;
				 
			}	
			

			if(quantity <= 500) {
				
				insertionSort(array);
				
			} else if(quantity > 500 && quantity <= 100000) {
				
				combSort(array);	
				
			} else {
				
				shellSort(array);
				
			}
			
			investArray(array);
		}
		
		else {
			
			for(int i=0; i<quantity; i++) {
				
				 double random = Math.random()*(rank2-rank1)+rank1;
				 array[i] = random;
				 
			}	
			
			checkRepetition(quantity, array, rank1, rank2);

			if(quantity <= 500) {
				
				insertionSort(array);
				
			} else if(quantity > 500 && quantity <= 100000) {
				
				combSort(array);	
				
			} else {
				
				shellSort(array);
				
			}
			
			investArray(array);	
			
		}
	}
	
	public void generateRandomOption4(int quantity, double rank1, double rank2, int option, double percentage) {
		
		if(option == 0) {
		
			for(int i=0; i<quantity; i++) {
				
				 double random = Math.random()*(rank2-rank1)+rank1;
				 array[i] = random;
				 
			}	
				
			if(quantity <= 500) {
				
				insertionSort(array);
				
			} else if(quantity > 500 && quantity <= 100000) {
				
				combSort(array);	
				
			} else {
				
				shellSort(array);
				
			}
			
			
			int k = (int)(quantity*percentage)/100;
			for(int i=(quantity-k); i<((quantity-k)+(k/2)); i++) {
				for(int j=quantity-1; j>((quantity-k)+(k/2)); j--) {
					
					double aux;
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
					
					
				}
				
			}
			
		}else {
			
			for(int i=0; i<quantity; i++) {
				
				 double random = Math.random()*(rank2-rank1)+rank1;
				 array[i] = random;
				 
			}	
			
			checkRepetition(quantity, array, rank1, rank2);

			
			if(quantity <= 500) {
				
				insertionSort(array);
				
			} else if(quantity > 500 && quantity <= 100000) {
				
				combSort(array);	
				
			} else {
				
				shellSort(array);
				
			}
			
			int k = (int)(quantity*percentage)/100;
			for(int i=(quantity-k); i<((quantity-k)+(k/2)); i++) {
				for(int j=quantity-1; j>((quantity-k)+(k/2)); j--) {
					
					double aux;
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
					
					
				}
				
			}
			
			
			
		}
	}
	
	public void checkRepetition(int quantity, double[] arrayToSort, double rank1, double rank2) {
		
		for(int i = 0; i < quantity; i++){ 
			   for(int j = 0; j < quantity; j++){
				    if(arrayToSort[i]==arrayToSort[j] && i!=j){
					     double rnd = Math.random()*(rank2-rank1)+rank1;
					     arrayToSort[i]=rnd;
					     i=0;
				    }
			  
			   }
			}
		
	}

	
	public void combSort(double[] arrayToSort) {
		
		int n = arrayToSort.length;
		 
        int gap = n;

        boolean swapped = true;

        while (gap != 1 || swapped == true) {
            
            gap = getNextGap(gap);
            swapped = false;
 
            for (int i=0; i<n-gap; i++)
            {
                if (arrayToSort[i] > arrayToSort[i+gap])
                {
                    
                    double temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+gap];
                    arrayToSort[i+gap] = temp;
 
                    
                    swapped = true;
                }
            }
        }
		
		
	}
	
	
	
	public int getNextGap(int gap) {
		
		
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
	
	public void insertionSort(double[] arrayToSort) {
		
		for (int i = 1; i < arrayToSort.length; i++) {
			for (int j = i; j >0;j--) {
				double current = arrayToSort[j];
				double toEvaluate = arrayToSort[j-1];
				if(toEvaluate > current) {
					double aux = arrayToSort[j-1];
					arrayToSort[j-1] = arrayToSort[j];
					arrayToSort[j] = aux;
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