package com.panda.java.test.memory;
import java.lang.ref.WeakReference;

public class WeakReferenceTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Person a = new Person();
        a.name = "Hello, reference";
        WeakReference<Person> weak = new WeakReference<Person>(a);
        a = null;
        int i = 0;
        while (weak.get() != null) {
            System.out.println(String.format("Get str from object of WeakReference: %s, count: %d", weak.get().name, ++i));
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
