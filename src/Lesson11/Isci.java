package Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Isci extends Muhasebe{

	public static void main(String[] args) {
		Isci isci1= new Isci();
		isci1.id=isci1.idAtama();
		isci1.isim="Sehri";
		isci1.soyIsim="Gokcan";
		isci1.adres="Eindhoven Hollanda";
		isci1.telefon="0651932404";
		isci1.saatlikUcret=20;
		isci1.statu="Lead";
		isci1.maas= isci1.maasHesapla(isci1.saatlikUcret);
		
		Isci isci2= new Isci();
		isci2.id=isci2.idAtama();
		isci2.isim="Merve";
		isci2.soyIsim="Gunal";
		isci2.adres=" Eskisehir Turkiye";
		isci2.telefon="0651932404";
		isci2.saatlikUcret=15;
		isci2.statu="Stajyer";
		isci2.maas= isci2.maasHesapla(isci2.saatlikUcret);

		
		Isci isci3= new Isci();
		isci3.id=isci3.idAtama();
		isci3.isim="Talip";
		isci3.soyIsim="Altas";
		isci3.adres="Amsterdam Hollanda";
		isci3.telefon="0651234404";
		isci3.saatlikUcret=25;
		isci3.statu="Developer";
		isci3.maas= isci3.maasHesapla(isci3.saatlikUcret);

		
	List<Isci> list= new ArrayList<Isci>(Arrays.asList(isci1,isci2,isci3));
	
	for (Isci w: list) {
		System.out.println("Id:\t\t"+ w.id+
				"\nIsim:\t\t"+ w.isim + 
				"\nSoyisim:\t"+ w.soyIsim +
				"\nAdres:\t\t"+ w.adres +
				"\nTelefon:\t"+ w.telefon +
				"\nS. Ucret:\t"+ w.saatlikUcret +
				"\nStatu:\t\t"+ w.statu +
				"\nMaas:\t\t"+ w.maas );
		System.out.println();
	}
	
	
		
	}
}
