package foods;

import java.util.ArrayList;

public class ShortPrepFoods extends Food{
	private boolean shortPrepTime = true;
	ArrayList<Food> shortPrep = new ArrayList<Food>(); 

	public ShortPrepFoods(double serving, int calories) {
		super(serving, calories);
	}

	public void addShortPrepFood(Food food) {
		shortPrep.add(food);
	}
	
	public ArrayList<Food> getArrayShortAccess() {
		return shortPrep;
	}


}
