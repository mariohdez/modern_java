package modern_java;

public class AppleHeavyWeightPredicate implements ApplePredicate {
	
	private static int HEAVY_WEIGHT = 151;

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() >= HEAVY_WEIGHT;
	}
}
