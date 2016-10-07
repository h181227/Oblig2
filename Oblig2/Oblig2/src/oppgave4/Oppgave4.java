package oppgave4;

import easyIO.In;
import easyIO.Out;
public class Oppgave4 {
	
	public static void main(String[] args){
		
		Out ut = new Out();					//Lager objekter for å styre easyIO klassene
		In tastatur = new In();
		
		Vare en = new Vare();				//Lager to Vare objekter.
		Vare to = new Vare();
		
		String vareNavn;
		int varePris;
		
		en.setNavn("Mais");
		en.setVarenr(1);					//Setter verdier for vare "en" med Setters
		en.setPris(40);
		
		to.setNavn("Melk");
		to.setVarenr(2);					//Setter verdier for vare "to" med Setters
		to.setPris(23);
		
		System.out.println("Moms for vare 1: " + en.moms() + "\n"); //Tester ut metoden moms.
		
		en.skriv();							//skriver ut verdiene for begge varene på skjermen
		to.skriv();
		
		ut.outln("Skriv inn navn og pris på ny vare for: ");
		vareNavn = tastatur.next();			
		varePris = tastatur.inInt();		//Ber bruker skrive inn inn navn og pris på ny vare
		
		Vare tre = new Vare(3, vareNavn, varePris);	//Registrer ny vare med Konstruktøren og variabler oppgitt av bruker
		
		tre.billigereEnn(en);				//Ser om den nyregistrerte varen er billigere enn "en" og "to"
		tre.billigereEnn(to);
	}
}