package com.panda.java.test.sort;

public class MainSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] sorts_1 = { 1, 2, 8, 9, 5, 6, 45, 87 };
		BubbleSort bubbleSort = new BubbleSort(sorts_1);
		bubbleSort.execute();

		System.out.println("");
		for (int i = 0; i < sorts_1.length; i++) {
			System.out.print(sorts_1[i] + " = ");
		}
		System.out.println("");

		int[] sorts_2 = { 1, 2, 8, 9, 5, 6, 45, 87 };
		InsertSort insertSort = new InsertSort(sorts_2);
		insertSort.execute();

	}

}
