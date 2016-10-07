package oppgave3;

public class HvorMangeKastFør6 extends Oppgave3 {

	public static void kast() {

		int j = 0;
		while (j < tabell.length && tabell[j] != 6) {
			j++;
		}
		int kast = j + 1;
		skjerm.outln("");
		skjerm.outln("");
		skjerm.outln("Det tok: " + kast + " kast før man traff en sekser");
		skjerm.outln("");

	}

}
