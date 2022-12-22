package Lesson05;

import java.util.Scanner;

public class Question01 {
	/*
	 * 1)Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i
	 * olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara gore 
	 * e
	 * mail kontrolu yapiniz.
	 * 
	 * -@ isareti icermiyorsa “gecersiz email” yazdirin 
	 * -@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin -@gmail.com ile bitmiyorsa “Yazimda bir
	 * sorun var, maili kontrol ediniz” yazdirin.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("E-mailiniz: ");
		String email = scan.nextLine();
		emailKontrol(email);	

		scan.close();
	}
	public static void emailKontrol(String email) {
		if(!email.contains("@")) {
			System.out.print("Gecersiz E-mail.. ");
		}else if (!email.contains("@gmail")) {
			System.out.print("Lutfen gmail adresinizi giriniz. ");
		}else if (!email.endsWith("@gmail.com")) {
			System.out.print("Yazimda bir sorun var, maili kontrol ediniz");
		}else {
			System.out.print("E-mail adresiniz dogru..");

		}
	}
	

}
