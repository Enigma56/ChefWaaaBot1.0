package foods;

import java.util.ArrayList;

public abstract class Food {
	private boolean gluten, vegetarian, nuts, healthy;
	private int prepTime, caloriesPerServing, calories;
	private double serving;

	public Food(double serving, int prepTime) {

		this.serving = serving;
		this.prepTime = prepTime;
	}
	
	public String containsGluten() {
		if(gluten == true)
			return "This food contains GlUtEn";
		else {
			return "This food is gluten free!";
		}
	}
	
	public String isVegetarian() {
		if(vegetarian == true)
			return "This food is vegetarian!";
		else {
			return "This food is not vegetarian";
		}
	}
	
	public String containsNuts() {
		if(nuts == true)
			return "This food contains nuts!";
		else {
			return " THis food does not contain nuts!";
		}
	}
	
	public String isHealthy() {
		if(healthy == true) 
			return "This food is healthy";
		else {
			return "This food is not healthy!";
		}
	}
	
	public int getPrepTime() {
		return prepTime;
	}
	
	public double getServings() {
		return serving;
	}
	
	public int caloriesPerServing() {
		return caloriesPerServing;
	}
	
	public int getCalories() {
		return calories;
	}
	

}
