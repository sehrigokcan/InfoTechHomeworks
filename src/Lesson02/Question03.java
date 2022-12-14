package Lesson02;

import java.util.Scanner;

public class Question03 {
	public static void main(String[] args) {
		/*
		 * 3- Type a program which converts the mile to kilometer. Mile value will be
		 * entered by user. (Use double) Hint 1: km = mile x 1.6 Hint 2: To get double,
		 * use nextDouble()
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the mile value: ");
		double mile = scan.nextDouble();
		double km = mile * 1.6;
		System.out.println("Mile to km: " + km);
	}

}
