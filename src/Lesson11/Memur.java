package Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Memur extends Muhasebe{

	public static void main(String[] args) {
		Memur memur1= new Memur();
		memur1.id=memur1.idAtama();
		memur1.isim="Sevim";
		memur1.soyIsim="Ylin";
		memur1.adres="Eindhoven Hollanda";
		memur1.telefon="0651932404";
		memur1.saatlikUcret=30;
		memur1.statu="Usta Basi";
		memur1.maas= memur1.maasHesapla(memur1.saatlikUcret);
		
		Memur memur2= new Memur();
		memur2.id=memur2.idAtama();
		memur2.isim="Faruk";
		memur2.soyIsim="Gunal";
		memur2.adres=" Eskisehir Turkiye";
		memur2.telefon="0651932404";
		memur2.saatlikUcret=20;
		memur2.statu="Cirak";
		memur2.maas= memur2.maasHesapla(memur2.saatlikUcret);

		
		Memur memur3= new Memur();
		memur3.id=memur3.idAtama();
		memur3.isim="Ali";
		memur3.soyIsim="Altas";
		memur3.adres="Pendik Istanbul";
		memur3.telefon="0651234404";
		memur3.saatlikUcret=10;
		memur3.statu="Stajyer";
		memur3.maas= memur3.maasHesapla(memur3.saatlikUcret);

		
	List<Memur> list= new ArrayList<Memur>(Arrays.asList(memur1,memur2,memur3));
	
	for (Memur w: list) {
		System.out.println("Id:\t\t"+ w.id+
				"\nIsim:\t\t"+ w.isim + 
				"\nSoyisim:\t\t"+ w.soyIsim +
				"\nAdres:\t\t"+ w.adres +
				"\nTelefon:\t\t"+ w.telefon +
				"\nS. Ucret:\t\t"+ w.saatlikUcret +
				"\nStatu:\t\t"+ w.statu +
				"\nMaas:\t\t"+ w.maas );
		System.out.println();
	}
	
}
}
