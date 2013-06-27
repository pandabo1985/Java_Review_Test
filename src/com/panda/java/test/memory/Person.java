package com.panda.java.test.memory;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 122L;
	String name;
	Person friend;

	public Person() {
	}
	public Person(String name){
		super();
		this.name = name;
	}
}
