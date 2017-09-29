package jenkins;

public class operater4 {

	public static double sqrt(int number) {

		double t;
		double squareRoot = number / 2;

		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;

		} while ((t - squareRoot) != 0);

		return squareRoot;
	}

	public double squareRoot(double a) {
		return Math.sqrt(a);
	}

}
