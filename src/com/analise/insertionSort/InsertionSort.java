package com.analise.insertionSort;

import com.analise.common.AbstractSort;
import com.analise.common.GenericExecuteSort;

public class InsertionSort extends AbstractSort {
	
	public int[] sort(int[] array) {
		int arraySize = array.length;
		
		//Start time
		timer().startTime();

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
		
		//Finish time
		timer().finishTime();
		
		return array;
	}

	public static void main(String[] args) {
		GenericExecuteSort<InsertionSort> insertionSort = new GenericExecuteSort<InsertionSort>(InsertionSort.class);
		insertionSort.execute();
	}

}
