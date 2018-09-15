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
		
		//Start time
		insertionSort.timer().startTime();
		
		//Aciona a função de ordenação
		array = insertionSort.sort(array);
		
		//Finish time
		insertionSort.timer().finishTime();
		
		//Imprime tempo de execução
		System.out.print("Insertion sort - ");
		insertionSort.timer().printElapsedTime();
		
		/*****************************************************/
		//BUBBLE SORT
		BubbleSort bubbleSort = new BubbleSort();
		
		//Start time
		bubbleSort.timer().startTime();
		
		//Aciona a função de ordenação
		array = bubbleSort.sort(array);
		
		//Finish time
		bubbleSort.timer().finishTime();
		
		//Imprime tempo de execução
		System.out.print("Bubble sort - ");
		bubbleSort.timer().printElapsedTime();
		
		/*****************************************************/
		//MERGE SORT
		MergeSort mergeSort = new MergeSort();
		
		//Start time
		mergeSort.timer().startTime();
		
		//Aciona a função de ordenação
		array = bubbleSort.sort(array);
		
		//Finish time
		mergeSort.timer().finishTime();
		
		//Imprime tempo de execução
		System.out.print("Merge sort - ");
		mergeSort.timer().printElapsedTime();
	}

}
