package oppgave4;

import easyIO.Out;
public class Vare {
	
	Out ut = new Out();
	
	private int varenr;
	private String navn;
	private double pris;
	private double moms;
	
	
	public Vare() {
		varenr = 0;
		navn = "";						//Standarkonstruktør.
		pris = 0.0;
	}
	
	public Vare(int varenr, String navn, double pris) {
		this.varenr = varenr;
		this.navn = navn;				//Konstruktør for Vare.
		this.pris = pris;
	}

	public double moms() {
		moms = pris/5;					//Valgte double som return fordi 1/5 av noe kommer ofte som desimaltall.
		return moms;
	}
	
	public void billigereEnn(Vare v) {
		if(v.pris > pris){
			ut.outln(navn + " er billigere enn " + v.navn);			//Kunne valgt å returnere en boolean her også, men valte bare å skrive det rett ut på
		}															//skjermen i stedet.			
		else{
			ut.outln(navn + " er ikke billigere enn " + v.navn);
		}
	}
	
	public void skriv() {
		ut.outln("Vare nr.: " + this.varenr + "\nVare: " + this.navn + "\nPris: " + this.pris + ",- \nMoms: " + moms() + ",- \n"); 
	}										//Skriver ut alt for gitte vare

	
	//Getters og Setters
	public int getVarenr() {
		return varenr;
	}

	public void setVarenr(int varenr) {
		this.varenr = varenr;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

}
