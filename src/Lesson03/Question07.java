package Lesson03;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		/*
		 * 7-Kullanıcıdan 4 basamakli birsayi girmesini isteyin. Girdiği sayi 5’e
		 * bölünüyorsa son rakamını control edin. Sonrakamı 0 ise ekrana “5’e bölünen
		 * çift sayı” yazdırın. Sonrakamı 0 değilse “5’e bölünen tek sayı” yazdırın.
		 * Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın. (Nested
		 * Ternary kullanalim)
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("4 basamakli sayi giriniz : ");
		int sayi = input.nextInt();

		// 1. Yol
//		if (sayi % 5 == 0) {
//			if (sayi % 10 == 0) {
//				System.out.println("5’e bölünen çift sayı..");
//			} else {
//				System.out.println("5’e bölünen tek sayı..");
//			}
//		} else {
//			System.out.println("Tekrar deneyin..");
//
//		}
		
		
		//2. yol
		
		String durum=((sayi>=-9999 && sayi<=10000))? 
				((sayi % 5 == 0) ? (((sayi % 10 == 0) ? "5’e bölünen çift sayı.." : "5’e bölünen tek sayı..")) : "tekrar deneyiniz"): "4 basamakli giriniz"; 
		
		System.out.println(durum);
		
		input.close();

	}

}
