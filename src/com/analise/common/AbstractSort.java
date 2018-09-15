package com.analise.common;

import java.util.Scanner;

public abstract class AbstractSort {
	ExecutionTimer timer = new ExecutionTimer();
	Scanner in = new Scanner(System.in);
	
	public int getArraySize() {
		System.out.print("Informe o tamanho do array: ");
		
		return Integer.parseInt(in.nextLine());
	}
	
	public void printArray(int[] array) {
		System.out.println("--------- início ---------");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("----------- fim ----------");
	}
	
	public ExecutionTimer timer() {
		return timer;
	}
}
