package Lesson06;

import java.util.Scanner;

public class Question01 {

	/*
	 * E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri
	 * olduguna bakiniz. Bir tane class olusturarak bu ozellikleri kullanan 15 tane
	 * urun hazirlayiniz. (5 tanesi kullanicidan veri alinarak , 5 tanesi
	 * parametreli constructor kullanilarak, 5 tanesi bos constructor kullanilarak
	 * olmali)
	 */
	
	public static void main(String[] args) {
		
		Tablet tablet1=new Tablet();
		tablet1.marka="Apple";
		tablet1.model="IPad pro";
		tablet1.bellekDepolamaKapasitesi="512 GB";
		tablet1.ekranFormati="12.9 Inch";
		tablet1.isletimSistemi="IPadOS";
		tablet1.renk="Gri";
		tablet1.ramBellek="512 GB";
		tablet1.modelYili="2022";
		tablet1.fiyat= 1.715;
		tablet1.ozelFonksiyon="Telefon görüşmesi işlevi";
		tablet1.kablosuzTeknoloji="WIFI";
		tablet1.mobilTeknoloji="5G";
		tablet1.ortPilOmru=24;
		tablet1.durum="Yeni";
		tablet1.satici="Amazon.nl";
		

		
		Tablet tablet2=new Tablet();
		tablet2.marka="OUZRS";
		tablet2.model="TAB-M1";
		tablet2.bellekDepolamaKapasitesi="64 GB";
		tablet2.ekranFormati="10 Inch";
		tablet2.isletimSistemi="Android 11";
		tablet2.renk="Pembe";
		tablet2.ramBellek="3 GB";
		tablet2.modelYili="2018";
		tablet2.fiyat= 99.66;
		tablet2.ozelFonksiyon="Ortam kartı okuyucu";
		tablet2.kablosuzTeknoloji="Bluetooth";
		tablet2.mobilTeknoloji="3G";
		tablet2.ortPilOmru=10;
		tablet2.durum="Yeni";
		tablet2.satici="OUZRS";

		
		
		Tablet tablet3=new Tablet();
		tablet3.marka="Apple";
		tablet3.model="IPad pro";
		tablet3.bellekDepolamaKapasitesi="1 TB";
		tablet3.ekranFormati="11 Inch";
		tablet3.isletimSistemi="IPadOS";
		tablet3.renk="Gri";
		tablet3.ramBellek="1 TB";
		tablet3.modelYili="2022";
		tablet3.fiyat= 1.859;
		tablet3.ozelFonksiyon="Hızlı  şarj";
		tablet3.kablosuzTeknoloji="WiFi";
		tablet3.mobilTeknoloji="5G";
		tablet3.ortPilOmru=80;
		tablet3.durum="Yeni";
		tablet3.satici="Amazon.nl";
		
		
		
		Tablet tablet4=new Tablet();
		tablet4.marka="Lenovo";
		tablet4.model="Android";
		tablet4.bellekDepolamaKapasitesi="64 GB";
		tablet4.ekranFormati="10.6 Inch";
		tablet4.isletimSistemi="Android";
		tablet4.renk="Siyah";
		tablet4.ramBellek="4 GB";
		tablet4.modelYili="2022";
		tablet4.fiyat= 195;
		tablet4.ozelFonksiyon="Telefon görüşmesi işlevi";
		tablet4.kablosuzTeknoloji="Cellulair";
		tablet4.mobilTeknoloji="5G";
		tablet4.ortPilOmru=24;
		tablet4.durum="Yeni";
		tablet4.satici="Lenovo";
		

		
		Tablet tablet5=new Tablet();
		tablet5.marka="Samsung";
		tablet5.model="Galaxy Tab A8";
		tablet5.bellekDepolamaKapasitesi="32 GB";
		tablet5.ekranFormati="10.5 Inch";
		tablet5.isletimSistemi="Android";
		tablet5.renk="Gumus";
		tablet5.ramBellek="3 GB";
		tablet5.modelYili="2022";
		tablet5.fiyat= 185;
		tablet5.ozelFonksiyon="USB";
		tablet5.kablosuzTeknoloji="WiFi";
		tablet5.mobilTeknoloji="5G";
		tablet5.ortPilOmru=25;
		tablet5.durum="Yeni";
		tablet5.satici="Samsung";
		
		Tablet tablet6= new Tablet("Samsung", "Galaxy Tab A8","32 GB","10.5 Inch","Android","Gumus","3 GB","2022",185,"USB", "WiFi", "5G", 25,"Yeni","Samsung");
		Tablet tablet7= new Tablet("Lenovo","Android","64 GB","10.6 Inch","Android","Siyah","4 GB","2022",195,"Telefon görüşmesi işlevi","Cellulair", "5G",24 ,"Yeni", "Lenovo");
		Tablet tablet8= new Tablet("Apple","IPad pro","512 GB","12.9 Inch","IPadOS","Gri","512 GB","2022",1.715,"Telefon görüşmesi işlevi","WIFI","5G", 24,"Yeni", "Amazon.nl");
		Tablet tablet9= new Tablet("OUZRS","TAB-M1","64 GB","10 Inch","Android 11","Pembe","3 GB","2018",99.66,"Ortam kartı okuyucu","Bluetooth","3G", 10 ,"Yeni", "OUZRS");
		Tablet tablet10= new Tablet("Apple","IPad pro","1 TB","11 Inch","IPadOS","Gri","1 TB","2022",1.859,"Hızlı  şarj","WiFi","5G",80,"Yeni","Amazon.nl");
		
		
		Scanner scan=new Scanner(System.in);
		
		Tablet tablet11=new Tablet();
		
		System.out.print("Tablet markasi : ");
		tablet11.marka = scan.nextLine();
		System.out.print("Tablet modeli : ");
		tablet11.model = scan.nextLine();
		System.out.print("Tablet bellek depolama kapasitesi : ");
		tablet11.bellekDepolamaKapasitesi = scan.nextLine();
		System.out.print("Tablet ekran formati : ");
		tablet11.ekranFormati = scan.nextLine();
		System.out.print("Tablet isletim sistemi : ");
		tablet11.isletimSistemi = scan.nextLine();
		System.out.print("Tablet renk : ");
		tablet11.renk = scan.nextLine();
		System.out.print("Tablet RAM bellek kapasitesi : ");
		tablet11.ramBellek = scan.nextLine();
		System.out.print("Tablet model yili : ");
		tablet11.modelYili = scan.nextLine();
		System.out.print("Tablet fiyat : ");
		tablet11.fiyat = scan.nextDouble();
		System.out.print("Tablet ozel fonksiyonlari : ");
		tablet11.ozelFonksiyon = scan.nextLine();
		System.out.print("Tablet kablosuz teknoloji : ");
		tablet11.kablosuzTeknoloji = scan.nextLine();
		System.out.print("Tablet mobil teknoloji : ");
		tablet11.mobilTeknoloji = scan.nextLine();
		System.out.print("Tablet ortalama pil omru : ");
		tablet11.ortPilOmru = scan.nextInt();
		System.out.print("Tablet durum : ");
		tablet11.durum = scan.nextLine();
		System.out.print("Tablet satici: ");
		tablet11.satici = scan.nextLine();
		
		
		
	}
	
	
}
