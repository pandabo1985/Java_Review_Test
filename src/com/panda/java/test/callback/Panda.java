package com.panda.java.test.callback;

/**
 * boy friend
 * 
 * @author panda
 * 
 */
public class Panda implements HouseWorkUtil {

	private LuLu luLu;

	private Panda panda;

	public Panda(LuLu luLu) {
		panda = this;
		this.luLu = luLu;
	}

	public void hungryForMeal(String mealName) {
		LogJava.log("current class");
		System.out.println(this.getClass().getSimpleName()
				+ " feel hungry and want to eat " + mealName);
		luLu.dealMeal(panda, mealName);
	}

	public void dirtyForClothes(String clothesName) {
		LogJava.log("current class");
		System.out.println(this.getClass().getSimpleName() + "　find "
				+ clothesName + "clothes is diry!");
		luLu.dealClothes(Panda.this, clothesName);
	}

	@Override
	public void makeMeal(String mealName) {
		LogJava.log("current class");
		System.out.println(mealName + " has been readied!");
	}

	@Override
	public void washClothes(String clostheName) {
		LogJava.log("current class");
		System.out.println(clostheName + " has been washed");
	}

}
