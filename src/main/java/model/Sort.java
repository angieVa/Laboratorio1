package model;

import java.util.Arrays;

public class Sort {
	
	private int quantityNumbers;
	private static double[] array;

	public Sort(int quantityNumbers, double rank1, double rank2, int option) {
		
		this.quantityNumbers = quantityNumbers;
		array = new double[quantityNumbers];
		generateRandom(quantityNumbers, rank1, rank2, option);
		
	}
	//Opcion 0 = numeros entre un rango, se pueden repetir, orden aleatorio
	//Opcion 1 = numeros entre un rango, no se pueden repetir, orden aleatorio
	//Opcion 2 = numeros generados de forma aleatoria, ordenados, se pueden repetir
	//Opcion 3 = numeros generados de forma aleatoria, ordenados, no se pueden repetir
	//Opcion 4 = numeros generados de forma aleatoria, ordenados de forma inversa, se pueden repetir
	//Opcion 5 = numeros generados de forma aleatoria, ordenados de forma inversa, no se pueden repetir
	//Opcion 6 = numeros generados de forma aleatpria, ordenados en un porcentaje, se pueden repetir
	//Opcion 7 = numeros generados de forma aleatoria, ordenados en un porcentaje, no se pueden repetir
	
	public void generateRandom(int quantity, double rank1, double rank2, int option) {
		
		if(option == 0) {
		
			generateRandomOption0(quantity, rank1, rank2, option);
		
		}
		
		else if(option == 1) {
			
			
			
		}
		
		else if(option == 2) {
			
			generateRandomOption2(quantity, rank1, rank2, option);
			
		}
		
	}
	
	public void generateRandomOption0(int quantity, double rank1, double rank2, int option) {
		
		for(int i=0; i<quantity; i++) {
			
			 double random = Math.random()*(rank2-rank1)+rank1;
			 array[i] = random;
			 
			}
		
	}
	
	public void generateRandomOption2(int quantity, double rank1, double rank2, int option) {
		
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
