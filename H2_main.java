package h2;

public class H2_main {
	public static void main(String[] args) {
		int jahr = 1400;
		boolean schalt;

		if (jahr % 400 == 0) {
			schalt = true;
		} else if (jahr % 100 == 0) {
			schalt = false;
		} else if (jahr % 4 == 0) {
			schalt = true;
		} else {
			schalt = false;
		}

		System.out.println("Jahr: " + jahr);
		System.out.println("Schaltjahr: " + schalt);
	}
}