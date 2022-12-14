package Lesson03;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan java kodunu
		 * yazalım. Not: if else kullanalım..
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("1. sayi: ");
		int sayi1 = input.nextInt();
		System.out.print("2. sayi: ");
		int sayi2 = input.nextInt();
		System.out.print("3. sayi: ");
		int sayi3 = input.nextInt();

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.print("Maximum sayi 1.sayi olan : " + sayi1);
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.print("Maximum sayi 2. sayi olan : " + sayi2);
		} else {
			System.out.print("Maximum sayi 3. sayi olan: " + sayi3);
		}

		input.close();

	}

}
