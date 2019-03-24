package foods;

public class LasagnaVeg extends Food {
	public LasagnaVeg(double serving) {
		super(serving, 90);
		this.setCalsPerServing(464);
		this.setCalories(serving);
		this.setNut(false);
		this.setHealth(false);
		this.setVeg(true);
		this.setGluten(true);
	}

}
