package com.panda.java.test.sort;

public class BubbleSort {
	private int[] intSorts;

	public BubbleSort(int[] sorts) {
		this.intSorts = sorts;
	}

	public void execute() {
		if (intSorts.length == 0) {
			System.out.println("长度为零！");
			return;
		}

		for (int i = 0; i < intSorts.length; i++) {
			for (int j = i + 1; j < intSorts.length; j++) {
				if (intSorts[i] > intSorts[j]) {
					int temp = intSorts[i];
					intSorts[i] = intSorts[j];
					intSorts[j] = temp;
				}

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
