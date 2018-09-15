package com.analise.common;

public abstract class AbstractSort {
	ExecutionTimer timer = new ExecutionTimer();
	
	public ExecutionTimer timer() {
		return timer;
	}
}
