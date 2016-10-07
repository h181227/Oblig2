package oppgave3;

public class SkrivUtTabell extends Oppgave3 {

	public static void skrivUt(int[] array) {

		for (int i = 0, teller = 0; i < array.length; i++, teller++) {

			if (teller == 20) {

				teller = 0;
				System.out.println("");
			}

			System.out.print(array[i] + " ");

		}

	}
}