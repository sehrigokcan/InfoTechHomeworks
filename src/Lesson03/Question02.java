package Lesson03;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * 2-Kullanıcıdan bir gün girmesini isteyelim. a. Eger girilen gun hafta sonu
		 * ise tekrar kontrol edelim Cumartesi ise Cumartesi ve hafta sonu, Pazar ise
		 * Pazar ve hafta sonu yazdıralım. b. Degil ise gün hafta ici yazdıralım. 1.
		 * Note: equals ile karsilastiralim 2. Nested ternary kullanalım..
		 */
		
		Scanner input= new Scanner(System.in);
		System.out.print("Bir gun ismi giriniz: ");
		String gun=input.next();
		
		String durum= (gun.equals("Cumartesi") || gun.equals("Pazar")) ? (gun.equals("Cumartesi") ? "Cumartesi ve hafta sonu": "Pazar ve hafta sonu")
			: "Hafta ici"; 
		
		
		System.out.print(durum);
		
		input.close();

	}

}
