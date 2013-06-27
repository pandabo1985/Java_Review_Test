package com.panda.java.test.memory;

import java.lang.ref.SoftReference;

public class SoftReferenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "Hello, reference";
		SoftReference<Person> sr = new SoftReference<Person>(a);
		a = null;
		int i = 0;
		while (sr.get() != null) {
			System.out.println(String.format(
					"Get str from object of SoftReference: %s, count: %d",
					sr.get().name, ++i));
			if (i % 10 == 0) {
				System.gc();
				System.out.println("System.gc() was invoked!");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("object a was cleared by JVM!");
	}

}