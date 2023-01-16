package Lesson12;

public class Ogretmen extends Akademisyen{

	String unvan;
	
	public Ogretmen(String adSoyad, String telefon, String ePosta, double maas,String bolum, String gorev, String dersler,
			String unvan) {
		super(adSoyad, telefon, ePosta,maas, bolum, gorev, dersler);
		this.unvan = unvan;
	}

	public String toplantilaraGir() {
		return this.adSoyad+ " toplantiya girdi..";
	}
	
	public String sinavlariOku() {
		return this.adSoyad+ " sinavlari okudu..";

}
	public double zamYap(double maas) {
		maas+=maas*0.25;
		return maas;
		
	}

}
