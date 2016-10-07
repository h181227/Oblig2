package oppgave3;

import easyIO.Out;

public class Oppgave3 {

	static int randomTall = 0;
	static int[] tabell = new int[100];
	static Out skjerm = new Out();
	static int forsteSekserKast = tabell.length + 1;
	static int antallKaster = 0;
	static double sum = 0;

	public static void main(String[] args) {

		Out skjerm = new Out();
		skjerm.outln("	TERNINGSIMULATOR");
		skjerm.outln("");
		int tabell[] = LagTabell.lagTabell();
		SkrivUtTabell.skrivUt(tabell);
		HvorMangeKastFør6.kast();
		HvilkeTallTrillet.hvilke();

	}

}
