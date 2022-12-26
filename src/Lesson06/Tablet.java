package Lesson06;

public class Tablet {


	String marka;
	String model;
	String bellekDepolamaKapasitesi;
	String ekranFormati;
	String isletimSistemi;
	String renk;
	String ramBellek;
	String modelYili;
	double fiyat;
	String ozelFonksiyon; // Telefon görüşmesi işlevi Ortam kartı okuyucu USB OTG'yi destekleyin Hızlı  şarj Stereo hoparlörler
	String kablosuzTeknoloji; // Bluetooth Cellulair NFC WiFi
	String mobilTeknoloji; // 2G 3G 4G 5G
	int ortPilOmru;
	String durum; // yeni kullanilmis
	String satici;

	public Tablet( String marka, String model, String bellekDepolamaKapasitesi, String ekranFormati,
			String isletimSistemi, String renk, String ramBellek, String modelYili, double fiyat, String ozelFonksiyon,
			String kablosuzTeknoloji, String mobilTeknoloji, int ortPilOmru, String durum, String satici) {
		super();
	
		this.marka = marka;
		this.model = model;
		this.bellekDepolamaKapasitesi = bellekDepolamaKapasitesi;
		this.ekranFormati = ekranFormati;
		this.isletimSistemi = isletimSistemi;
		this.renk = renk;
		this.ramBellek = ramBellek;
		this.modelYili = modelYili;
		this.fiyat = fiyat;
		this.ozelFonksiyon = ozelFonksiyon;
		this.kablosuzTeknoloji = kablosuzTeknoloji;
		this.mobilTeknoloji = mobilTeknoloji;
		this.ortPilOmru = ortPilOmru;
		this.durum = durum;
		this.satici = satici;
	}

	public Tablet() {

	}

	
	public String toString() {
		return "\nTablet\n marka=" + marka + ", \nmodel=" + model + ", \nbellekDepolamaKapasitesi=" + bellekDepolamaKapasitesi
				+ ", \nekranFormati=" + ekranFormati + ", \nisletimSistemi=" + isletimSistemi + ", \nrenk=" + renk
				+ ", \nramBellek=" + ramBellek + ", \nmodelYili=" + modelYili + ", \nfiyat=" + fiyat + ", \nozelFonksiyon="
				+ ozelFonksiyon + ", \nkablosuzTeknoloji=" + kablosuzTeknoloji + ", \nmobilTeknoloji=" + mobilTeknoloji
				+ ", \nortPilOmru=" + ortPilOmru + ", \ndurum=" + durum + ", \nsatici=" + satici + "";
	}
}
