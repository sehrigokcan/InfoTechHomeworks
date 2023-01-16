package Lesson12;

public class Calisan {
	String adSoyad;
	String telefon;
	String ePosta;
	double maas;
	
	public Calisan(String adSoyad, String telefon, String ePosta,double maas) {
		super();
		this.adSoyad = adSoyad;
		this.telefon = telefon;
		this.ePosta = ePosta;
		this.maas= maas;
	}
	void giris() {
		System.out.print(this.adSoyad+ " calisan giris yapti\n");
	}
	void cikis() {
		System.out.print(this.adSoyad+ " calisan cikis yapti\n");

	}
	void yemek() {
		System.out.print(this.adSoyad+ " calisan yemek yedi\n");

	}
	
	public double zamYap(double maas) {
		maas+=maas*0.10;
		return maas;		
	}
	
	public static void listeleGiris(Calisan[] girisYapanlar) {
		for (Calisan w: girisYapanlar) {
			w.giris();
		}
		
	}
	
	public static void listeleCikis(Calisan[] cikisYapanlar) {
		for (Calisan w: cikisYapanlar) {
			w.cikis();
		}
		
	}

}
