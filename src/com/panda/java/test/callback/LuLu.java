package com.panda.java.test.callback;

/**
 * girl friend
 * 
 * @author panda
 * 
 */
public class LuLu {

	public void dealMeal(HouseWorkUtil houseWork,String mealName) {

		try {
			LogJava.log("current class");
			System.out.println(this.getClass().getSimpleName()+ " Ready go meal!");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LogJava.log("current class");
		System.out.println("meal is ready, callback");
		houseWork.makeMeal(mealName);

	}
	public void dealClothes(HouseWorkUtil houseWork,String clothes) {
		
		try {
			LogJava.log("current class");
			System.out.println(this.getClass().getSimpleName()+ " Ready go clothes!");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LogJava.log("current class");
		System.out.println("clothes is ready, callback");
		houseWork.washClothes(clothes);
		
	}

}
