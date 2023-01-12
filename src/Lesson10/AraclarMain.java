package Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AraclarMain {

	public static void main(String[] args) {
		Araclar arac1 = new Araclar();
		arac1.setPlaka("34AKS34");
		arac1.setIsimSoyisim("Sehri Gokcan");
		arac1.setMarka("BMW");
		arac1.setModel("X1");
		arac1.setAracDurumu("Calinti");
		arac1.setAdres("Hollanda");

		Araclar arac2 = new Araclar();
		arac2.setPlaka("34TLP06");
		arac2.setIsimSoyisim("Talip Altas");
		arac2.setMarka("Audi");
		arac2.setModel("E-Tron");
		arac2.setAracDurumu("Calinti");
		arac2.setAdres("Almanya");

		Araclar arac3 = new Araclar();
		arac3.setPlaka("06MRV54");
		arac3.setIsimSoyisim("Merve Gokcan");
		arac3.setMarka("Citroen");
		arac3.setModel("C3 Aircross");
		arac3.setAracDurumu("Calinti Degil");
		arac3.setAdres("Turkiye");

		Araclar arac4 = new Araclar();
		arac4.setPlaka("34ZDR78");
		arac4.setIsimSoyisim("Guldane Ozdemir");
		arac4.setMarka("Ford");
		arac4.setModel("EcoSport");
		arac4.setAracDurumu("Calinti");
		arac4.setAdres("Turkiye");

		Araclar arac5 = new Araclar();
		arac5.setPlaka("65KRS89");
		arac5.setIsimSoyisim("Nermin Akarsu");
		arac5.setMarka("Dacia");
		arac5.setModel("Duster");
		arac5.setAracDurumu("Calinti Degil");
		arac5.setAdres("Isvicre");

		Araclar arac6 = new Araclar();
		arac6.setPlaka("54AKR21");
		arac6.setIsimSoyisim("Nazli Akar");
		arac6.setMarka("BMW");
		arac6.setModel("X6");
		arac6.setAracDurumu("Calinti Degil");
		arac6.setAdres("Almanya");

		Araclar arac7 = new Araclar();
		arac7.setPlaka("09IPK05");
		arac7.setIsimSoyisim("Sema Ipek");
		arac7.setMarka("Chevrolet");
		arac7.setModel("Blazer");
		arac7.setAracDurumu("Calinti Degil");
		arac7.setAdres("Norvec");

		Araclar arac8 = new Araclar();
		arac8.setPlaka("81AKS76");
		arac8.setIsimSoyisim("Sare Altas");
		arac8.setMarka("Dodge");
		arac8.setModel("Nitro");
		arac8.setAracDurumu("Calinti Degil");
		arac8.setAdres("Hollanda");

		Araclar arac9 = new Araclar();
		arac9.setPlaka("02TRK02");
		arac9.setIsimSoyisim("Tarik Akarsu");
		arac9.setMarka("Hyundai");
		arac9.setModel("Bayon");
		arac9.setAracDurumu("Calinti Degil");
		arac9.setAdres("Isvicre");

		Araclar arac10 = new Araclar();
		arac10.setPlaka("34AKK34");
		arac10.setIsimSoyisim("Seher Tok");
		arac10.setMarka("GMC");
		arac10.setModel("Sierra");
		arac10.setAracDurumu("Calinti Degil");
		arac10.setAdres("Finlandiya");

		List<Araclar> tumAraclar = new ArrayList<>(
				Arrays.asList(arac1, arac2, arac3, arac4, arac5, arac6, arac7, arac8, arac9, arac10));

		Scanner scan = new Scanner(System.in);
		System.out.println("Sorgulamak istediginiz aracin plakasini giriniz: ");
		String sorgulananPlaka = scan.nextLine();
		int count = 0;
		for (Araclar arac : tumAraclar) {
			if (arac.getAracDurumu().equals("Calinti") && arac.getPlaka().equals(sorgulananPlaka)) {
				System.out.println("Sorgulanan arac calintidir...");
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("Sorgulanan arac calinti degil...");
			
		}

	}

}
