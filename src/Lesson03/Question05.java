package Lesson03;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * 5-Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
		 * olmadigini yazdirin. (D, d, 3, ~, @, !, ...) (ip ucu: ascii tablosu
		 */
		Scanner input= new Scanner(System.in);
		System.out.print("Bir karakter giriniz: ");
		char karakter=input.next().charAt(0);
		if (Character.isAlphabetic(karakter)) { //(karakter>=65 && karakter<=90) || karakter>=97 && karakter<=122)
			System.out.print("Harf..");

		}else {
			System.out.print("Harf degil...");

		}
		input.close();

	}

}
