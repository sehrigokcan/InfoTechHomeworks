package Lesson04;

import java.util.Scanner;

public class Question02 {
	/*
	 * Soru 2) Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa
	 * “Girdiginiz isim a harfi iceriyor” - isim “Z” harfi iceriyorsa “Girdiginiz
	 * isim Z harfi iceriyor” - ikisi de yoksa “Girdiginiz isim a veya Z harfi
	 * icermiyor” yazdirin.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Isminiz: ");
		String isim = scan.nextLine();
		if (isim.contains("a"))
			System.out.println("Girdiginiz isim a harfi iceriyor");
		if (isim.contains("Z"))
			System.out.println("Girdiginiz isim Z harfi iceriyor");
		if (!isim.contains("a") && !isim.contains("Z"))
			System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
		
		scan.close();
	}

}
