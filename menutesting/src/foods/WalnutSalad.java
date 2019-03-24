package foods;

public class WalnutSalad extends Food {
	public WalnutSalad(double serving) {
		super("Walnut and cranberry salad", serving, 5);
		
		this.setCalsPerServing(175.8);
		this.setCalories(serving);
		this.setNut(true);
		this.setHealth(true);
		this.setVeg(true);
		this.setGluten(false);
	}
}
