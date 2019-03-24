package foods;

public class SpaghettiMeat extends Food {
	public SpaghettiMeat(double serving) {
		
		super(serving, 10);
		this.setCalsPerServing(329);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(true);
		this.setVeg(false);
		this.setGluten(true);
	}

}
