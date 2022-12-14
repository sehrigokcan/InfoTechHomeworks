package Lesson03;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		/*
		 * 6-Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip
		 * yazdirin. 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin
		 * uzerinde ise “A”.(If, else if, else kullanalim)
		 */
		Scanner input= new Scanner(System.in);
		System.out.print("100 uzerinden notunuzu giriniz: ");
		byte not=input.nextByte();
		if (not<50) {
			System.out.print("D");
		}else if(not>=50 && not<60) {
			System.out.print("C");
		}else if(not>=60 && not<80) {
			System.out.print("B");
		}else if(not>=80 && not<101) {
			System.out.print("A");
		}else {
			System.out.print("Yanlis bir deger girdiniz..");

		}
		
		input.close();

	}

}
