package com.analise.insertionSort;

import com.analise.common.AbstractSort;
import com.analise.common.ArrayGenerator;

public class InsertionSort extends AbstractSort {

	public static void main(String[] args) {
		InsertionSort app = new InsertionSort();
		
		//Pega o tamanho do array
		int arraySize = app.getArraySize();
		
		//Gera o array
		ArrayGenerator arrayGenerator = new ArrayGenerator();	
		int[] array = arrayGenerator.createArray(arraySize);
		
		//Imprime array antes da ordenação
		//app.printArray(array);
		
		//Start time
		app.timer().startTime();
		
		//Algoritmo Insertion Sort
		for (int i = 1; i < arraySize; i++) {
			int aux = array[i];
			int j = i;
			
			while ((j > 0) && (array[j - 1] > aux)) {
				array[j] = array[j - 1];
				j--;
			}
			
			array[j] = aux; 
		}
		
		//Finish and show execution time
		app.timer().finishTime();
		app.timer().printElapsedTime();

		//Imprime resultado da ordenação
		//app.printArray(array);
	}

}
