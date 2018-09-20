package com.analise.bubbleSort;

import com.analise.common.AbstractSort;
import com.analise.common.GenericExecuteSort;

public class BubbleSort extends AbstractSort {

	public int[] sort(int[] array) {
		int arraySize = array.length;
		
		//Start time
		timer().startTime();
				
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
		
		//Finish timer
		timer().finishTime();
		
		return array;
	}

	public static void main(String[] args) {
		GenericExecuteSort<BubbleSort> bubbleSort = new GenericExecuteSort<BubbleSort>(BubbleSort.class);
		bubbleSort.execute();
	}
}
