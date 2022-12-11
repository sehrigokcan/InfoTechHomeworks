package Lesson02;

import java.util.Scanner;

public class Question07 {
	public static void main(String[] args) {
		/*
		 * 7- Kullanicidan ismini ve soyismini isteyip asagidaki sekilde 
yazdirin.
Isminiz : Okan
Soyisminiz : Kaplan
Kursumuza katiliminiz alinmistir, tesekkur ederiz
		 */
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name= scan.nextLine();
		System.out.print("Enter your last name : ");
		String lastName= scan.nextLine();
		System.out.println("=============================================");
		System.out.print("Isminiz :\t"+ name+ "\n"+ "Soyisminiz :\t"+ lastName+ "\n"+ "Kursumuza katiliminiz alinmistir, tesekkur ederiz");

	}

}
