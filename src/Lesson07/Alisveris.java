package Lesson07;

import java.util.Arrays;
import java.util.Scanner;

public class Alisveris {
	static String urun1;
	static String urun2;
	static String urun3;
	static String urun4;
	static String urun5;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Amazondan 5 adet ucretsiz urun hakki kazandiniz.\nIsteginiz 5 urunu giriniz: ");
		System.out.println("1. urun: ");
		urun1 = scan.nextLine();

		System.out.println("2. urun: ");
		urun2 = scan.nextLine();

		System.out.println("3. urun: ");
		urun3 = scan.nextLine();

		System.out.println("4. urun: ");
		urun4 = scan.nextLine();

		System.out.println("5. urun: ");
		urun5 = scan.nextLine();

		Array a1 = new Array();

		System.out.println("Sirasiz: \t");
		System.out.print(Arrays.toString(a1.urunler));

		Arrays.sort(a1.urunler);
		
		System.out.println();
		System.out.println("Sirali: \t");
	

		for (int i = 0; i < 5; i++) {
			System.out.print(a1.urunler[i]+ " ");
		}

		

		if (Arrays.binarySearch(a1.urunler, "Tablet")>=0) {
			System.out.println("Degisiklik yaptiginiz urun listeye eklenmistir." + a1.urunler[3]);
		}

	}

}
