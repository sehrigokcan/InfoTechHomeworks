package Lesson05;

import java.util.Scanner;

public class Question05 {
	/*
	 * 5) Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve
	 * bitis degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak
	 * ekrana yazdiriniz.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Baslangic degeri: ");
		int bas = scan.nextInt();
		System.out.print("Bitis degeri: ");
		int bit = scan.nextInt();
		
		while(bas<=bit) {
			if (bas%2==0)
				System.out.print(bas+" ");
			bas++;
		}
		scan.close();
	}

}
