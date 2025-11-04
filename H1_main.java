package h1;

public class H1_main {
	public static void main(String[] args) {

		double guthaben = -100;
		double monEingang = 200;
		int rating = -2;
		boolean negativ;
		boolean warnhinweis;

		if (guthaben < 0) {
			
			negativ = true;

		} else {
			
			negativ = false;
		}

		if (guthaben > 0) {

			rating = rating + 3;

		} else if (guthaben == 0) {

			rating = rating + 2;

		} else {

			if (guthaben < 0 && Math.abs(monEingang) >= Math.abs(guthaben)) {

				rating = rating + 1;

			} else {

				rating = rating - 1;

			}
		}

		if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0) {

			warnhinweis = true;

		} else {

			warnhinweis = false;
		}

		System.out.println("Guthaben: " + guthaben + "€");
		System.out.println("Negativ: " + negativ);
		System.out.println("Monatlicher Geldeingang " + monEingang + "€");
		System.out.println("Dein Rating: " + rating);
		System.out.println("Warnhinweis: " + warnhinweis);
		

	}

}
