package com.panda.java.test.sort;

public class InsertSort {
	private int[] intSorts;

	public InsertSort(int[] sorts) {
		this.intSorts = sorts;
	}

	public void execute() {
		if (intSorts.length == 0) {
			System.out.println("长度为零！");
			return;
		}

		for (int i = 1; i < intSorts.length; i++) {
			if (intSorts[i - 1] > intSorts[i]) {
				int temp = intSorts[i];
				int j = i;
				while (j > 0 && intSorts[j - 1] > temp) {
					intSorts[j] = intSorts[j - 1];
					j--;
				}
				intSorts[j] = temp;
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
