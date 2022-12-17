package Lesson04;

import java.util.Scanner;

public class Question05 {
	/*
	 * Aşağıdaki sorunun zorluk seviyesi yüksektir. Kısmi çözümlerde kabul edilir.
	 * Soru 5) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari
	 * sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem
	 * basarisiz,Lutfen yeni bir sifre girin” yazdirin 
	 * - Ilk harf buyuk harf olmali
	 * - Son harf kucuk harf olmali 
	 * - Sifre bosluk icermemeli 
	 * - Sifre uzunlugu en az 8 karakter olmali
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sifreniz: ");
		String sifre=scan.nextLine();
		
		boolean sart1= sifre.startsWith(sifre.toUpperCase().substring(0,1));
		boolean sart2= sifre.endsWith(sifre.toLowerCase().substring(sifre.length()-1));
		boolean sart3= sifre.equals(sifre.replaceAll(" ",  ""));
		boolean sart4= sifre.length()>=8;
		

		if (sart1 && sart2 && sart3 && sart4) {
			System.out.print("Sifre basari ile tanimlandi");

		}else System.out.print("Islem basarisiz,Lutfen yeni bir sifre girin ");

		scan.close();
	}

}
