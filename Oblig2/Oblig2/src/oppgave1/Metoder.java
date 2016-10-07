package oppgave1;

public class Metoder {
	// klassemetode for aa reversere en streng. Tar en streng som argument
	public static void reverse(String streng) {
		// Iterer over alle elementene i strengen.
		for (int i=streng.length()-1;i>=0;i--) {
			// Skriver symbolet som ligger i elementet til konsoll.
			System.out.print(streng.charAt(i));
		}
	}
	
	// Klassemetode for aa sjekke om en liste av heltall er i stigende rekkefolge.
	public static void sjekkStigende(int[] liste) {
		// Iterer over alle elementene i listen
		for (int i=0;i<liste.length - 1;i++) {
			// Sjekker om det neste elementet i listen er mindre enn dette.
			if (liste[i + 1] < liste[i]) {
				// Skriver til konsoll, og avslutter metoden.
				System.out.println("Ikke stigende");
				return;
			}
		}
		System.out.println("Stigende");
	}
	
	/* Klassemetode for aa sjekke hvilket ord i en liste av ord som kommer forst 
	 * i unicode aplfabetet.
	 */
	public static void firstUnicode(String[] ordliste) {
		
		String firstWord = "";		// Lager tom streng.
		// Iterer over alle elementene i ordlisten
		for (int i=0;i<ordliste.length - 1;i++) {					
			/* Bruker "String" sin objektmetode "compareTo(String a)" 
			 * for aa sjekke om dette ordet er for det neste ordet i ordlisten i 
			 * unicode alfabetet.
			 * compareTo(String a) metoden returnerer et negativt heltall hvis 
			 * dette ordet kommer fremst i unicode alfabetet. */
			if ( ordliste[i].compareTo(ordliste[i + 1]) < 0 ) {
				// lagrer dette ordet
				firstWord = ordliste[i];
			}
			else {
				// lagrer det neste ordet
				firstWord = ordliste[i + 1];
			}
		}
		System.out.println("\"" + firstWord + "\" har lavest unicode verdi");
	}
}
