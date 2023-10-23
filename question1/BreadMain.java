package question1;

import java.util.Map;

public class BreadMain {

	public static void main(String[] args) {
		
BreadFactory breadFactory = new BreadFactory();
		
		String cream = "cream";
		Bread creamBread = breadFactory.getBread(cream);
		Map<String, Integer> recipe = creamBread.getRecipe();
		System.out.println("breadType : " + cream);
		System.out.println("recepe");
		for(String key : recipe.keySet()) {
			int value = recipe.get(key);
			System.out.println(key + " : " + value);
		}
		
		
		String sugar = "sugar";
		Bread sugarBread = breadFactory.getBread(sugar);
		Map<String, Integer> recipe2 = sugarBread.getRecipe();
		System.out.println("breadType : " + sugar);
		System.out.println("recepe");
		for(String key : recipe2.keySet()) {
			int value = recipe2.get(key);
			System.out.println(key + " : " + value);
		}
		
		
		String butter = "butter";
		Bread butterBread = breadFactory.getBread(butter);
		Map<String, Integer> recipe3 = butterBread.getRecipe();
		System.out.println("breadType : " + butter);
		System.out.println("recepe");
		for(String key : recipe3.keySet()) {
			int value = recipe3.get(key);
			System.out.println(key + " : " + value);
		}

	}

}
