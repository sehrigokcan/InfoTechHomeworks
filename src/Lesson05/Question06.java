package Lesson05;

import java.util.Scanner;

public class Question06 {
	/*
	 * 6) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac 
tane olduklarini ekranda yazdirin.(while dongusu ile)
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi: ");
		int sayi = scan.nextInt();
		int toplam=0;
		int i=1;
		while (i<=sayi)
		{
			if (sayi%i==0){
				System.out.print(i+ " ");
				toplam++;
			}
			i++;
		}
		System.out.println("sayilari "+ sayi + "'sinin bolenleridir.");
		System.out.println( toplam + " boleni vardir.");


		scan.close();
	}

}
