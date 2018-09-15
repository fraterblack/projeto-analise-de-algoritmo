package com.analise.common;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayGenerator {
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
		
		for(int i = 0, j = length; i < length; i++, j--) {
			array[i] = j;
		}
		
		return array;
	}
	
	public int[] createUnsortedArray(int length) {
		int[] array = new int[length];
		
		for(int i = 0, j = length; i < length; i++, j--) {
			array[i] = j;
		}
		
		shuffleArray(array);
		
		return array;
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
