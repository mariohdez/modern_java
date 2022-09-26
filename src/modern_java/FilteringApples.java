package modern_java;

import java.util.ArrayList;
import java.util.List;

public class FilteringApples {
	public static List<Apple> filterGreenApples(List<Apple> apples) {
		var greenApples = new ArrayList<Apple>();

		for (var apple : apples) {
			if (Color.GREEN.equals(apple.getColor())) {
				greenApples.add(apple);
			}
		}

		return greenApples;
	}
	
	public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
		var results = new ArrayList<Apple>();

		for (var apple : inventory) {
			if (apple.getColor().equals(color)) {
				results.add(apple);
			}
		}

		return results;
	}
	
	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
		var results = new ArrayList<Apple>();
		
		for (var apple : inventory) {
			if (apple.getWeight() > weight) {
				results.add(apple);
			}
		}

		return results;
	}
	
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
		var results = new ArrayList<Apple>();

		for (var apple : inventory) {
			if (predicate.test(apple)) {
				results.add(apple);
			}
		}

		return results;
	}
}
