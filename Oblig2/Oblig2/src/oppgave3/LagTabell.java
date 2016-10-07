package oppgave3;

import java.util.Random;

public class LagTabell extends Oppgave3 {

	public static int[] lagTabell() {

		Random random = new Random();

		int i = 0;

		while (i < 100) {
			randomTall = random.nextInt(7);

			tabell[i] = randomTall;

			if (randomTall != 0) {
				i++;
				antallKaster++;
			}

		}

		return tabell;

	}

}
