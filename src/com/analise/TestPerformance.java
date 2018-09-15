package com.analise;

import com.analise.bubbleSort.BubbleSort;
import com.analise.common.ArrayHelper;
import com.analise.insertionSort.InsertionSort;

public class TestPerformance {

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		BubbleSort bubbleSort = new BubbleSort();
		
		ArrayHelper arrayHelper = new ArrayHelper();
		
		//Pega o tamanho do array
		int arraySize = arrayHelper.getArraySize();
		
		//Gera o array
		int[] array = arrayHelper.createArray(arraySize);
		
		System.out.println("------- Resultados dos Testes -------");
		
		//INSERTION SORT
		//Start time
		insertionSort.timer().startTime();
		
		//Aciona a função de ordenação
		array = insertionSort.sort(array);
		
		//Finish time
		insertionSort.timer().finishTime();
		
		//Imprime tempo de execução
		System.out.print("Insertion sort - ");
		insertionSort.timer().printElapsedTime();
		
		//BUBBLE SORT
		//Start time
		bubbleSort.timer().startTime();
		
		//Aciona a função de ordenação
		array = bubbleSort.sort(array);
		
		//Finish time
		bubbleSort.timer().finishTime();
		
		//Imprime tempo de execução
		System.out.print("Bubble sort - ");
		bubbleSort.timer().printElapsedTime();
	}

}
