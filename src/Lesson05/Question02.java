package Lesson05;

import java.util.Scanner;

public class Question02 {
	/*
	 * ) ”InfotechAcademy1234...!’^.+ ” String ifadesinde, a.kac harf b.kac rakam
	 * c.kac ozel karakter oldugunu ekrana yazdıran karakterSay() metodunu yazınız
	 */

	public static void main(String[] args) {

		String str = "InfotechAcademy1234...!’^.+";
		karakterSay(str);

	}

	public static void karakterSay(String str) {
		int harf = 0;
		int rakam = 0;
		int ozelKarakter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				rakam++;
			} else if (Character.isAlphabetic(str.charAt(i))) {
				harf++;
			} else
				ozelKarakter++;
		}
		System.out.print(str + " metininde\n" + 
		harf + " tane harf\n" + 
		rakam + " tane rakam\n" + 
		ozelKarakter + " tane ozel karakter vardir.");

	}

}
