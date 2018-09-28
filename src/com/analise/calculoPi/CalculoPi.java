/*
 *************************************************************************
 *
 * Projeto: Cálculo Pi Ultilizando o Método de Leibniz
 *
 * Função: Calcular o valor de pi ultilizando como base o método de Leibniz de formas diferentes;
 * 
 * Código fonte completo do projeto disponível em https://github.com/fraterblack/projeto-analise-de-algoritmo
 *************************************************************************
 *
 * Autor: Eduardo Elias Américo da Silveira
 * 		 Edvaldo da Rosa
 * 		 Gilberto Topanotti
 *
 * Alteração:
 * Data: 27/09/2018
 *************************************************************************
 *
 *
 * Copyright 2018
 *
 *************************************************************************
 */
package com.analise.calculoPi;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import com.analise.common.AbstractSort;
import java.io.*;
import java.math.*;



public class CalculoPi {
	
	// implentar uma fomra de fazer ultizando Thread

	public static void main(String[] args) {

		double leibniz = 0;
		int termos = 1000000;
		
		double leibniz2 = 0;
		double denominator = 1;

		//matodo 1

		long startTime = System.currentTimeMillis();
		for (long n = 0; n < termos; n++) {

			leibniz += Math.pow(-1, n) / (2 * n + 1); // aplicação da fórmula
		}
		leibniz *= 4;
		long finishTime = System.currentTimeMillis();
		
		//metodo 2
		long startTime2 = System.currentTimeMillis();
		for (int x = 0; x < termos; x++) {

			if (x % 2 == 0) {
				leibniz2 = leibniz2 + (1 / denominator);
			} else {
				leibniz2 = leibniz2 - (1 / denominator);
			}
			denominator = denominator + 2;
		}
		leibniz2 = leibniz2 * 4;

		long finishTime2 = System.currentTimeMillis();
		System.out.println("Tipo 1");
		System.out.println(leibniz);
		System.out.println("Tempo de execução: " + (finishTime - startTime) + "ms");
		System.out.println();
		System.out.println("Tipo 2");
	    System.out.println(leibniz2);
		System.out.println("Tempo de execução: " + (finishTime2 - startTime2) + "ms");
	}

}
