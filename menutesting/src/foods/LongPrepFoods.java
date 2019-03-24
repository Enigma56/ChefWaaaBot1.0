package foods;

import java.util.ArrayList;

public class LongPrepFoods extends Food{
	private boolean longPrepTime = true;
	ArrayList<Food> longPrep = new ArrayList<Food>();

	public LongPrepFoods(double serving, int prepTime) {
		super(serving, prepTime);
	}
	public void addLongPrepFood(Food food) {
		longPrep.add(food);
	}
	
	public ArrayList<Food> getArrayLongAccess() {
		return longPrep;
	}


}
