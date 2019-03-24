package foods;

public class Sandwich extends Food {
	public Sandwich(double serving) {
		
		super("Turkey and swiss cheese sandwich", serving, 5);
		this.setCalsPerServing(405);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(true);
		this.setVeg(false);
		this.setGluten(true);
	}
}
