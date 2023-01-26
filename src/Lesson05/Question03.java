package Lesson05;

import java.util.Scanner;

public class Question03 {
	/*
	 * 3) Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin.
	 *  integer
	 * donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun.
	 * Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin.
	 * Islemin sonucunu main method’ dan verilen komutla yazdirin
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("1. sayi: ");
		int taban = scan.nextInt();
		System.out.print("2. sayi: ");
		int us = scan.nextInt();
		
		usHesap(taban,us);
		scan.close();
	}
	
	public static void usHesap(int taban,int us) {
		double sonuc=1;
		for (int i=1; i<=us;i++) {
			sonuc*=taban;
		}
		System.out.print("Sonuc: "+ sonuc);
		Math.pow(taban, taban);

	}

}
