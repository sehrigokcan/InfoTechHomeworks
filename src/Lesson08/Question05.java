package Lesson08;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
//	Soru5)Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Cumle giriniz: ");
		String cumle = scan.nextLine();
		String kelimeler[]= cumle.split(" ");
		
		System.out.print("Cumledeki kelime sayisi: "+ kelimeler.length);

	}

}
