package Lesson05;

import java.util.Scanner;

public class Question07 {
	/*
	 * 7) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin
	 * 0’a basmasini soyleyin. Kullanici 0’a bastiginda toplam kac pozitif sayi
	 * girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.(do
	 * while dongusu ile)
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int toplam = 0;
		int sayi;
		int kacsayi=0;
		do {
			System.out.print("Pozitif Sayi Giriniz:\nIslemi bitirmek icin 0'a basin");
			sayi = scan.nextInt();
			toplam += sayi;
			kacsayi++;

		} while (sayi != 0);

		System.out.print("Girdiginiz Sayilarin Toplami: " + toplam+ " "+ (kacsayi-1)+" tane sayi");

		scan.close();

	}

}
