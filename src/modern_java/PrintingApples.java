package modern_java;

import java.util.List;

public class PrintingApples {
	public static void prettyPrintApples(List<Apple> inventory, AppleFormatter formatter) {
		for (var apple : inventory) {
			var output = formatter.format(apple);
			System.out.println(output);
		}
	}
}
