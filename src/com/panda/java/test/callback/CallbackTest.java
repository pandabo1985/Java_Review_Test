package com.panda.java.test.callback;

public class CallbackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("");
		LuLu lu = new LuLu();
		Panda pan = new Panda(lu);
		pan.hungryForMeal("dumplings");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pan.dirtyForClothes("TangFu");
	}
}
