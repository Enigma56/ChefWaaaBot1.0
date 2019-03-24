package foods;

public class Timpano extends Food {
	public Timpano(double serving) {
		super("Timpano", serving, 120);
		this.setCalsPerServing(1155);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(false);
		this.setVeg(false);
		this.setGluten(true);
	}

}
