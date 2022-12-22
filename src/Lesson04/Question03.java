package Lesson04;

import java.util.Scanner;

public class Question03 {
	/*
	 * Soru 3) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun
	 * oldugunu yazdirin.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Isminiz: ");
		String isim = scan.nextLine();
		System.out.print("Soyisminiz: ");
		String soyIsim = scan.nextLine();

		System.out.println(isim.length() > soyIsim.length() ? 
				"Isminiz uzun" : "Soyisminiz uzun");

		scan.close();
	}

}
