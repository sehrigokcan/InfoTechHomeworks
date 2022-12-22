package Lesson04;

import java.util.Scanner;

public class Question04 {
	/*
	 * Soru 4) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve
	 * asagidaki gibi yazdirin. 
	 * isim-soyisim : O*** K***** 
	 * kart no : **** **** **** 1234
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Isminiz: ");
		String isim = scan.nextLine();
		System.out.print("Soyisminiz: ");
		String soyIsim = scan.nextLine();
		System.out.print("Kredi Karti: ");
		String krediKart = scan.nextLine();

		System.out.println("isim-soyisim : " + isim.charAt(0) + isim.substring(1).replaceAll("\\S", "*") + "\t"
				+ soyIsim.charAt(0) + soyIsim.substring(1).replaceAll("\\S", "*"));
		
		System.out.println("kart-no : " + krediKart.substring(0, krediKart.length() - 4).replaceAll("\\S", "*")
				+ krediKart.substring(krediKart.length() - 4));

		scan.close();

	}

}
