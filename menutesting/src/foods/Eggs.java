package foods;

public class Eggs extends Food {
	public Eggs(double serving) {
		super("Scrambled eggs", serving, 5);
		this.setCalsPerServing(91);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(true);
		this.setVeg(true);
		this.setGluten(false);
	}
}
