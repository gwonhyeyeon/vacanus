package question1;

import java.util.*;

public class CreamBread implements Bread {

	@Override
	public Map<String, Integer> getRecipe() {
		
		Map<String, Integer> recipe = new HashMap<String, Integer>();
		recipe.put("flour", 100);
		recipe.put("water", 100);
		recipe.put("cream", 200);
		return recipe;
	}




}
