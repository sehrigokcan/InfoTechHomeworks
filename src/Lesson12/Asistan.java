package Lesson12;

public class Asistan extends Akademisyen{

	String yuksekLisans;
	
	
	public Asistan(String adSoyad, String telefon, String ePosta, double maas,String bolum, String gorev, String dersler,
			String yuksekLisans) {
		super(adSoyad, telefon, ePosta,maas, bolum, gorev, dersler);
		this.yuksekLisans = yuksekLisans;
	}

	public  String lablaraGir() {
		return this.adSoyad+ " laba girdi..";
	}
	
	public String quizleriOku() {
		return this.adSoyad+ " quizleri okudu..";

	}
	
	public double zamYap(double maas) {
		maas+=maas*0.20;
		return maas;

	}
	
}
