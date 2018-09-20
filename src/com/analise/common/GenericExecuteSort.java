package com.analise.common;

public class GenericExecuteSort<T extends AbstractSort> {
	private T tobj;
	
	public GenericExecuteSort(Class<T> clazz) {
		try {
			tobj = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public void execute() {
		ArrayHelper arrayHelper = new ArrayHelper();
		
		//Pega o tamanho do array
		int arraySize = arrayHelper.getArraySize();
		
		//Gera o array
		int[] array = arrayHelper.createArray(arraySize);
		
		//Aciona a função de ordenação
		array = tobj.sort(array);
		
		//Imprime resultado da ordenação
		arrayHelper.printArray(array);
		
		//Imprime tempo de execução
		tobj.timer().printElapsedTime();
	}
}
