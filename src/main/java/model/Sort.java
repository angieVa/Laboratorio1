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
		
		shellSort(array);
		
		
	}
	
	public void shellSort(double[] arrayToSort) {
		
	int salto;
	double aux;
	boolean cambios;
	
		for(salto= arrayToSort.length/2; salto!=0; salto/=2){
			
			cambios=true;
			
		    while(cambios){ 
		    	
		    	cambios=false;
		    	
		        for(int i=salto; i< arrayToSort.length; i++) {
		        	
		        	if(arrayToSort[i-salto]>arrayToSort[i]){
		        		
		        		aux=arrayToSort[i]; 
		        		arrayToSort[i]=arrayToSort[i-salto];
		                arrayToSort[i-salto]=aux;
		                cambios=true; 
		           
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
