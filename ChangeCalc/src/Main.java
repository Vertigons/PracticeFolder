public class Main {

	public static void main(String[] args) {
		int Betrag = 133;

		berechneWechselgeld(Betrag);
	}

	public static void berechneWechselgeld(int x) {

		String[] names = { "50 cent", "20 cent", "5 cent", "2 cent", "1 cent" };
		int[] values = { 50, 20, 5, 2, 1 };
		double[] result = { 0, 0, 0, 0, 0 };

		int i = 0;

		double rest = x;

		while (i <= 4) {
			if (Math.floor(rest / values[i]) >= 1) {
				result[i] = Math.floor(rest / values[i]);
				rest = rest - values[i] * result[i];
				System.out.println(names[i] + ": " + result[i]);
				i++;
			} else {
				i++;
			}
		}

	}
}