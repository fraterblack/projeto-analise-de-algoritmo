package com.analise;

import com.analise.bubbleSort.BubbleSort;
import com.analise.common.ArrayHelper;
import com.analise.insertionSort.InsertionSort;
import com.analise.mergeSort.MergeSort;

public class TestPerformance {

	public static void main(String[] args) {
		ArrayHelper arrayHelper = new ArrayHelper();
		
		//Pega o tamanho do array
		int arraySize = arrayHelper.getArraySize();
		
		//Gera o array
		int[] array = arrayHelper.createArray(arraySize);
		
		System.out.println("------- Resultados dos Testes -------");
		
		/*****************************************************/
		//INSERTION SORT
		InsertionSort insertionSort = new InsertionSort();
		
		//Aciona a fun��o de ordena��o
		array = insertionSort.sort(array);
		
		//Imprime tempo de execu��o
		System.out.print("Insertion sort - ");
		insertionSort.timer().printElapsedTime();
		
		/*****************************************************/
		//BUBBLE SORT
		BubbleSort bubbleSort = new BubbleSort();
		
		//Aciona a fun��o de ordena��o
		array = bubbleSort.sort(array);
		
		//Imprime tempo de execu��o
		System.out.print("Bubble sort - ");
		bubbleSort.timer().printElapsedTime();
		
		/*****************************************************/
		//MERGE SORT
		MergeSort mergeSort = new MergeSort();

		//Aciona a fun��o de ordena��o
		array = mergeSort.sort(array);
		
		//Imprime tempo de execu��o
		System.out.print("Merge sort - ");
		mergeSort.timer().printElapsedTime();
	}

}
