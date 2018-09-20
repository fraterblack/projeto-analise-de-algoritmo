package com.analise.mergeSort;

import com.analise.common.AbstractSort;
import com.analise.common.GenericExecuteSort;

public class MergeSort extends AbstractSort {

	public int[] sort(int[] array) {
		int[] auxArray = new int[array.length];
		
		//Start time
		timer().startTime();
				
	    sort(array, 0, array.length, auxArray);
	    
	    //Finish timer
	  	timer().finishTime();
	    
	    return array;
	}
	
	private int[] sort(int[] array, int startIndex, int finalIndex, int[] auxArray) {
		if ((finalIndex - startIndex) < 2) {
			return null;
		}
	    
	    int middleIndex = (startIndex + finalIndex) / 2;
	    
	    sort(array, startIndex, middleIndex, auxArray);
	    sort(array, middleIndex, finalIndex, auxArray);
	    
	    return merge(array, startIndex, middleIndex, finalIndex, auxArray);
	}
	
	private int[] merge(int[] array, int startIndex, int middleIndex, int finalIndex, int[] auxArray) {
		int leftIndex = startIndex;
	    int rightIndex = middleIndex;
	    for (int i = startIndex; i < finalIndex; ++i) {
	        if ((leftIndex < middleIndex) && ((rightIndex >= finalIndex) || (array[leftIndex] < array[rightIndex]))) {
	            auxArray[i] = array[leftIndex];
	            ++leftIndex;
	        } else {
	            auxArray[i] = array[rightIndex];
	            ++rightIndex;
	        }
	    }
	    
	    //Recria o array original com o conteúdo do array auxiliar
	    for (int i = startIndex; i < finalIndex; ++i) {
	    	array[i] = auxArray[i];
	    }
	    
	    return array;
	}

	public static void main(String[] args) {
		GenericExecuteSort<MergeSort> mergeSort = new GenericExecuteSort<MergeSort>(MergeSort.class);
		mergeSort.execute();
	}
}
