package foods;


public abstract class Food {
	private boolean gluten, vegetarian, nuts, healthy;
	private int prepTime;
	private double serving, caloriesPerServing, calories;
	private String name;

	public Food(String name, double serving, int prepTime) {

		this.name = name;
		this.serving = serving;
		this.prepTime = prepTime;
	}
	public void setCalories(double serving) {
		calories = caloriesPerServing*serving;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalsPerServing(double val) {
		caloriesPerServing = val;
	}
	public int getPrepTime() {
		return prepTime;
	}
	
	public double getServings() {
		return serving;
	}
	public void setGluten(boolean bool) {
		gluten = bool;
	}
	public boolean getGluten() {
		return gluten;
	}
	public void setVeg(boolean bool) {
		vegetarian = bool;
	}
	public boolean getVeg() {
		return vegetarian;
	}
	public void setNut(boolean bool) {
		nuts = bool;
	}
	public boolean getNut() {
		return nuts;
	}
	public void setHealth(boolean bool) {
		healthy = bool;
	}
	public boolean getHealth() {
		return healthy;
	}
	
	public double GetCaloriesPerServing() {
		return caloriesPerServing;
	}
	public String getName() {
		return name;
	}
	
	public String containsGluten() {
		if(gluten == true)
			return "This food contains gluten";
		else {
			return "This food is gluten free";
		}
	}
	
	public String isVegetarian() {
		if(vegetarian == true)
			return "This food is vegetarian";
		else {
			return "This food is not vegetarian";
		}
	}
	
	public String containsNuts() {
		if(nuts == true)
			return "This food contains nuts";
		else {
			return " THis food does not contain nuts";
		}
	}
	
	public String isHealthy() {
		if(healthy == true) 
			return "This food is healthy";
		else {
			return "This food is not healthy";
		}
	}
	public String toString() {
		String s = "";
		s += name + "has " + getCalories() + " calories\n";
		s += isHealthy() + "\n";
		s += containsNuts() + "\n";
		s += isVegetarian() + "\n";
		s += containsGluten() + "\n";
		return s;
	}
	

}
