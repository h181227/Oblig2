package oppgave1;

public class Oppgave1 {

	public static void main(String[] args) {

		// Definerer testdata
		int[] liste1 = { -45, -3, 0, 67 };
		int[] liste2 = { -45, -3, 0, -67 };
		String[] ordliste = { "ord", "streng", "apekatt" };
		String ord = "baklengs";

		// Prøver metoder med passende test data
		Metoder.sjekkStigende(liste1);
		Metoder.sjekkStigende(liste2);
		Metoder.firstUnicode(ordliste);
		Metoder.reverse(ord);
	}
}