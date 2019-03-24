package menutesting;

import foods.Food;

public class Timpano extends Food {
	public Timpano(double serving) {
		super(serving, 120);
		this.setCalsPerServing(1155);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(false);
		this.setVeg(false);
		this.setGluten(true);
	}

}
