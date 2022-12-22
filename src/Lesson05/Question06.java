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
		for (int i=1;i<=sayi;i++)
		{
			if (sayi%i==0){
				System.out.print(i+ " ");
			}
		}
		System.out.print("sayilari "+ sayi + "sinin bolenleridir.");

		scan.close();
	}

}
