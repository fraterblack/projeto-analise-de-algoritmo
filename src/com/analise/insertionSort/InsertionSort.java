package com.analise.insertionSort;

import com.analise.common.AbstractSort;
import com.analise.common.ArrayHelper;

public class InsertionSort extends AbstractSort {
	
	public int[] sort(int[] array) {
		int arraySize = array.length;
		
		//Algorithm Insertion Sort
		for (int i = 1; i < arraySize; i++) {
			int aux = array[i];
			int j = i;
			
			while ((j > 0) && (array[j - 1] > aux)) {
				array[j] = array[j - 1];
				j--;
			}
			
			array[j] = aux; 
		}
		
		return array;
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		
		ArrayHelper arrayHelper = new ArrayHelper();
		
		//Pega o tamanho do array
		int arraySize = arrayHelper.getArraySize();
		
		//Gera o array
		int[] array = arrayHelper.createArray(arraySize);
		
		//Imprime array antes da ordenação
		//arrayHelper.printArray(array);
		
		//Start time
		insertionSort.timer().startTime();
		
		//Aciona a função de ordenação
		array = insertionSort.sort(array);
		
		//Finish time
		insertionSort.timer().finishTime();
		
		//Imprime resultado da ordenação
		arrayHelper.printArray(array);
		
		//Imprime tempo de execução
		insertionSort.timer().printElapsedTime();
	}

}
