package Lesson02;

import java.util.Scanner;

public class Question06 {
	public static void main(String[] args) {
		/*
		 * 6- Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini 
ve yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin.
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length of the long side of the rectangular prism : ");
		double a= scan.nextDouble();
		System.out.print("Enter the length of the short side of the rectangular prism : ");
		double b= scan.nextDouble();
		System.out.print("Enter the height of the rectangular prism ");
		double h= scan.nextDouble();

		double volumeRectangularPrism= a*b*h;
		
		System.out.println("The volume of the rectangular prism: "+ volumeRectangularPrism);
	}

}
