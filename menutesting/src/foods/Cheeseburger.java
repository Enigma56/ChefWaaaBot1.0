package foods;

public class Cheeseburger extends Food {
	public Cheeseburger(double serving) {
		super("Cheeseburger", serving, 15);
		
		this.setCalsPerServing(365);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(false);
		this.setVeg(false);
		this.setGluten(true);
	}
}
