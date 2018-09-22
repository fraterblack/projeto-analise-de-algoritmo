package com.analise.insertionSort;

import com.analise.common.AbstractSort;
import com.analise.common.GenericExecuteSort;

public class InsertionSort extends AbstractSort {
	
	public static int comparacao = 0;
	public static int troca = 0;
	
	public int[] sort(int[] array) {
		int arraySize = array.length;
		
		//Reseta controles
		comparacao = 0;
		troca = 0;
		
		//Start time
		timer().startTime();

		//Algorithm Insertion Sort
		for (int i = 1; i < arraySize; i++) {
			int aux = array[i];
			int j = i;
			
			comparacao++;
			comparacao++;
			while ((j > 0) && (array[j - 1] > aux)) {
				troca++;
				array[j] = array[j - 1];
				j--;
			}
			
			array[j] = aux; 
		}
		
		//Finish time
		timer().finishTime();
		
		return array;
	}

	public static void main(String[] args) {
		GenericExecuteSort<InsertionSort> insertionSort = new GenericExecuteSort<InsertionSort>(InsertionSort.class);
		insertionSort.execute();
		
		System.out.println("Comparações: " + InsertionSort.comparacao);
		System.out.println("Trocas: " + InsertionSort.troca);
	}

}
