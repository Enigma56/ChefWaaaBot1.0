package foods;

public class SpaghettiMarinara extends Food{

	public SpaghettiMarinara(double serving) {
		super("Spaghetti with marinara sauce", serving, 10);
		this.setCalsPerServing(285);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(true);
		this.setVeg(true);
		this.setGluten(true);
	}

}
