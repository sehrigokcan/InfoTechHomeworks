package Lesson03;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * 3-Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
		 * baslayan gun isimlerini yazdirin. Ornek ilkHarf=P output = “Pazar, Pazartesi
		 * veya Persembe” ilkHarf=S output = “Sali” (switch case default ile yapalim)
		 * 
		 */
		Scanner input= new Scanner(System.in);
		System.out.print("Bir gun isminin ilk harfini giriniz: ");
		char ilkHarfGun=input.next().charAt(0);
		
		switch(ilkHarfGun) {
		case 'P':
			System.out.print("Pazar, Pazartesi veya Persembe ");
			break;
		case 'S':
			System.out.print("Sali");
			break;
		case 'Ç':
			System.out.print("Çarsamba");
			break;
		case 'C':
			System.out.print("Cuma Cumartesi ");
			break;
		default:
			System.out.print("Gecersiz harf..");

		
		}
		input.close();

	}

}
