package modern_java;

public class PrintWeightFormatter implements AppleFormatter {

	@Override
	public String format(Apple apple) {
		if (apple.getWeight() > 150) {
			return "Heavy";
		} else {
			return "Light";
		}
	}

}
