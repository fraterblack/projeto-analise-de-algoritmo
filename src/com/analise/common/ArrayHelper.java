package com.analise.common;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayHelper {
	Scanner in = new Scanner(System.in);
	
	public int[] createArray(int length) {
		String option;
		
		System.out.print("Informe o tipo do array (1 = Asc, 2 = Desc, 3 = Random): ");
		option = in.nextLine();
		
		switch (option) {
			case "1":
				return createAscSortedArray(length);
			case "2":
				return createDescSortedArray(length);
			case "3":
				return createUnsortedArray(length);
			default:
				return createArray(length);
		}
	}
	
	public int[] createAscSortedArray(int length) {
		int[] array = new int[length];
		
		for(int i = 0; i < length; i++) {
			array[i] = i;
		}
		
		return array;
	}
	
	public int[] createDescSortedArray(int length) {
		int[] array = new int[length];
		
		for(int i = 0, j = length - 1; i < length; i++, j--) {
			array[i] = j;
		}
		
		return array;
	}
	
	public int[] createUnsortedArray(int length) {
		int[] array = new int[length];
		
		for(int i = 0; i < length; i++) {
			array[i] = i;
		}
		
		shuffleArray(array);
		
		return array;
	}
	
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
	
	//Implementing Fisher–Yates shuffle
	static void shuffleArray(int[] array) {
		Random rnd = ThreadLocalRandom.current();
		for (int i = array.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			int a = array[index];
			array[index] = array[i];
			array[i] = a;
		}
	}
}
