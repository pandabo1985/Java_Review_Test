package com.panda.java.test.sort;

public class SelectionSort {
	private int[] intSorts;

	public SelectionSort(int[] sorts) {
		this.intSorts = sorts;
	}

	public void execute() {
		if (intSorts.length == 0) {
			System.out.println("长度为零！");
			return;
		}

		for (int i = 0; i < intSorts.length; i++) {
			int temp = intSorts[i];
			int minIndex = i;
			for (int j = i; j < intSorts.length; j++) {
				if (temp > intSorts[j]) {
					temp = intSorts[j];
					minIndex = j;
				}
			}

			if (temp < intSorts[i]) {
				intSorts[minIndex] = intSorts[i];
				intSorts[i] = temp;
			}

		}

		printSort();
	}

	private void printSort() {

		for (int i = 0; i < intSorts.length; i++) {
			System.out.print(intSorts[i] + " , ");
		}

	}
}
