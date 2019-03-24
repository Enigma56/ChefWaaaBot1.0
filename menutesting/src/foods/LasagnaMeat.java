package foods;

public class LasagnaMeat extends Food {
	public LasagnaMeat(double serving) {
		super("Lasagna with meat sauce", serving, 90);
		this.setCalsPerServing(487);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(false);
		this.setVeg(false);
		this.setGluten(true);
	}
}
