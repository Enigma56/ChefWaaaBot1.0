package foods;

public class Tacos extends Food {
	public Tacos(double serving) {
		super("Beef tacos", serving, 15);
		this.setCalsPerServing(170);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(false);
		this.setVeg(false);
		this.setGluten(false);
	}
}
