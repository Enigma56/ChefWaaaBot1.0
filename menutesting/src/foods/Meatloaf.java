package foods;

public class Meatloaf extends Food {
	public Meatloaf(double serving) {
		super("Meatloaf", serving, 55);
		this.setCalsPerServing(321);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(false);
		this.setVeg(false);
		this.setGluten(false);
	}
}
