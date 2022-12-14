package Lesson03;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*
		 * 4-Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin
		 * kutsal gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun”
		 * yazdirin. “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin.
		 * (switch case default ile yapalim)
		 */
		Scanner input= new Scanner(System.in);
		System.out.print("Gun adi giriniz: ");
		String gun=input.next();
		
		switch(gun) {
		case "Cuma":
			System.out.print("Muslumanlar icin kutsal gun");
			break;
		case "Cumartesi":
			System.out.print("Yahudiler icin kutsal gun");
			break;
		case "Pazar":
			System.out.print("Hiristiyanlar icin kutsal gun");
			break;
		default:
				System.out.print("Kutsal gun degil..");

		}
		input.close();
	}

}
