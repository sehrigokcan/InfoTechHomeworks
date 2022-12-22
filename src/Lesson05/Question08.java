package Lesson05;

import java.util.Scanner;

public class Question08 {
	/*
	 * 8) Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e
	 * ulasincaya kadar sayi istemeye devam edin. Toplam 500’e ulastiginda veya
	 * gectiginde sayilarin toplami ve kac sayi girildigini yazdirin.(do while
	 * dongusu ile)
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int toplam=0;
		 int sayi=1;
		 int sayilar=0;
			do {
			System.out.print("Sayi Giriniz: ");
			sayi = scan.nextInt();
			toplam+=sayi;
			sayilar+=1;

			}while(toplam<=500);
				
			System.out.println("Girdiginiz Sayilarin Toplami: "+ toplam);
			System.out.println(sayilar+" tane sayi girdiniz...");
		
			scan.close();

	}

}
