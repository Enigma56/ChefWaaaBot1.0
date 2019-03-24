package foods;

public class Steak extends Food {
	public Steak(double serving) {
		super("Sirloin steak cooked medium-well", serving, 20);
		
		this.setCalsPerServing(745);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(true);
		this.setVeg(false);
		this.setGluten(false);
	}
}
