package com.analise.bubbleSort;

import com.analise.common.AbstractSort;
import com.analise.common.ArrayHelper;
import com.analise.bubbleSort.BubbleSort;

public class BubbleSort extends AbstractSort {

	public int[] sort(int[] array) {
		int arraySize = array.length;
		
		//Algorithm Bubble Sort
		for (int i = 0; i < arraySize - 1; i++) {
			for (int j = i + 1; j < arraySize; j++){
	            if (array[j] < array[i]){
	                int aux = array[i];
	                array[i] = array[j];
	                array[j] = aux;
	            }
	        }
		}
		
		return array;
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
	
		ArrayHelper arrayHelper = new ArrayHelper();
		
		//Pega o tamanho do array
		int arraySize = arrayHelper.getArraySize();
		
		//Gera o array
		int[] array = arrayHelper.createArray(arraySize);
		
		//Start time
		bubbleSort.timer().startTime();
		
		//Aciona a fun��o de ordena��o
		array = bubbleSort.sort(array);
		
		//Finish time
		bubbleSort.timer().finishTime();
		
		//Imprime resultado da ordena��o
		arrayHelper.printArray(array);
		
		//Imprime tempo de execu��o
		bubbleSort.timer().printElapsedTime();
	}
}
