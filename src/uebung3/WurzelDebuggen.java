package uebung3;

public class WurzelDebuggen {

	public static void main(String[] args) {
		int n = 4;
		int sqr = 0;
		int result = 0;
		for (; result < n; sqr++) {
			result = sqr * sqr;
		}
		if (result == n) {
			System.out.println("Die Wurzel aus " + n + " ist " + sqr);
		} else {
			System.out.println("Keine Wurzel f�r " + n + " gefunden.");
			System.out.println("Die n�chst gr��ere Zahl mit einer Wurzel " + "in den nat�rlichen Zahlen ist " + result
					+ " die Wurzel ist " + sqr);
		}
	}
}
