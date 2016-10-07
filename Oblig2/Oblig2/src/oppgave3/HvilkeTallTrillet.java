package oppgave3;

public class HvilkeTallTrillet extends Oppgave3 {

	public static void hvilke() {

		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int mestAv = 0;
		String tallet = "";

		int t = 0;

		while (t < 100) {
			if (tabell[t] == 1) {
				one++;
			} else if (tabell[t] == 2) {
				two++;
			} else if (tabell[t] == 3) {
				three++;
			} else if (tabell[t] == 4) {
				four++;
			} else if (tabell[t] == 5) {
				five++;
			} else
				six++;
			if (tabell[t] <= 6 && tabell[t] > 0) {
				sum += tabell[t];
				t++;
				antallKaster++;

			}
		}

		if (one > mestAv) {

			mestAv = one;
			tallet = "en";

		}

		if (two > mestAv) {
			mestAv = two;
			tallet = "to";

		}
		if (three > mestAv) {
			mestAv = three;
			tallet = "tre";
		}
		if (four > mestAv) {
			mestAv = four;
			tallet = "fire";
		}
		if (five > mestAv) {
			mestAv = five;
			tallet = "fem";
		}
		if (six > mestAv) {
			mestAv = six;
			tallet = "seks";

		}
		// skjerm.outln(mestAv);
		skjerm.outln("Antall seksere	: " + six);
		skjerm.outln("Antall femere	: " + five);
		skjerm.outln("Antall firere	: " + four);
		skjerm.outln("Antall treere	: " + three);
		skjerm.outln("Antall toere	: " + two);
		skjerm.outln("Antall enere	: " + one);

		skjerm.outln("Det er mest av: " + tallet);
		skjerm.out("Gjennomsnittet er: ");
		skjerm.out(sum / 100, 3);
	}
}