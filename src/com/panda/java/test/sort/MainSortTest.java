package com.panda.java.test.sort;

public class MainSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BubbleSort");
		int[] sorts_1 = { 1, 2, 8, 9, 5, 6, 45, 87 };
		BubbleSort bubbleSort = new BubbleSort(sorts_1);
		bubbleSort.execute();

		System.out.println("");
		for (int i = 0; i < sorts_1.length; i++) {
			System.out.print(sorts_1[i] + " = ");
		}
		System.out.println("");
		System.out.println("InsertSort");
		int[] sorts_2 = { 1, 2, 8, 9, 5, 6, 45, 87 };
		InsertSort insertSort = new InsertSort(sorts_2);
		insertSort.execute();
		
		System.out.println("");
		System.out.println("SelectionSort");
		int[] sorts_3 = { 1, 2, 8, 9, 5, 6, 45, 87 };
		SelectionSort selectionSort = new SelectionSort(sorts_3);
		selectionSort.execute();

	}

}
