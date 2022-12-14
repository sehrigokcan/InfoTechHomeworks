package Lesson02;

import java.util.Scanner;

public class Question05 {
	public static void main(String[] args) {
		/*
		 * 5- Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve
		 * alanini hesaplayip yazdirin.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the side length of the squae: ");
		double lengthSquare = scan.nextDouble();
		double perimeterSquare = lengthSquare * 4;
		double areaSquare = lengthSquare * lengthSquare;

		System.out.println("The perimeter of the squae: " + perimeterSquare);
		System.out.println("The area of the squae: " + areaSquare);

	}

}
