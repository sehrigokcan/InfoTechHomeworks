package Lesson05;

import java.util.Scanner;

public class Question09 {
	/*
	 * 9 Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
	 * carpim tablosu olusturun. Ornek,kullanici 3 girerse, 
	 * 1 2 3 
	 * 2 4 6 
	 * 3 6 9
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi : ");
		int sayi = scan.nextInt();

		for (int i=1;i<=sayi;i++) {
			System.out.println();
			for (int j=1;j<=sayi;j++) {
				System.out.print(i*j+ "\t");
			}
		}
		scan.close();
	}

}
