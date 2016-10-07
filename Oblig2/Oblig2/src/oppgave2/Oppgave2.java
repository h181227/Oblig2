package oppgave2;

import java.util.Arrays;
import java.util.Random;


public class Oppgave2 {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[] slumpTall = new int[1000];         // Lage en Array med 1000 plasser. (for å vise at programmet funker)
		int i = slumpTall.length;                   // flytter hele tabellen inn i i.
		double k = System.currentTimeMillis();     // Starter sekundtelleren for programmet.
		for (i = 0; i < 1000; i++) {             // Lager en for løkke for tabellen.
			slumpTall[i] = random.nextInt(2);       // Gjør tallene i for-løkken til random og gir den mulighet til å kun bruke 1 og 0.
			Arrays.sort(slumpTall);                 // Sorterer 0-erne og 1-erne.
		System.out.println(slumpTall[i]);         // Denne printer ut tallene. 
			
		}
		
		
		
		
		System.out.println((System.currentTimeMillis()-k)/1000 + "s"); // avslutter tiden programmet har brukt og printer det ut.
		
	}

}