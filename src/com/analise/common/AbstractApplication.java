package com.analise.common;

public class AbstractApplication {
	long startTime = 0;
	long finishTime = 0;
	
	public void startTime() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void finishTime() {
		this.finishTime = System.currentTimeMillis();
	}
	
	public void printElapsedTime() {
		System.out.println("Tempo de execução: " + (finishTime - startTime) + "ms");
	}
}
