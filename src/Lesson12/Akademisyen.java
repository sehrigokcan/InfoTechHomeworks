package Lesson12;

public class Akademisyen extends Calisan{

	String bolum;
	String gorev;
	String dersler;
	
	public Akademisyen(String adSoyad, String telefon, String ePosta,double maas, String bolum, String gorev, String dersler) {
		super(adSoyad, telefon, ePosta, maas);
		this.bolum = bolum;
		this.gorev = gorev;
		this.dersler = dersler;
	}

	public String derseGir() {
		return this.adSoyad+ " derse girdi..";

	}
	
	public double zamYap(double maas) {
		maas+=maas*0.15;
		return maas;
		
	}
}
