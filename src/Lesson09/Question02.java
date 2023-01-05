package Lesson09;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//import Lesson09.Question02;

public class Question02 {

	public static void main(String[] args) {
//		2. Kullanicidan dogum tarihini isteyin ve yasini; 
//		a) Gun, ay, yil olarak yasHesapla() static void metodu’ nda, 
//		b) Sade ay olarak ay() non-static void metodu’ nda,
//		c) Sadece gun olarak gun() non-static String donuslu method’ unda,
//		hesaplayiniz.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dogum Tarihini giriniz: YYYY-MM-DD");
		String dogumTarih= scan.nextLine();
		yasHesapla(dogumTarih);
		
		Lesson09.Question02 obj = new Lesson09.Question02();
		obj.ay(dogumTarih);
		System.out.println("Gun olarak yasiniz:  " + obj.gun(dogumTarih));

		

		
		
	}
	public static void yasHesapla(String tarih) {
		String t[]=tarih.split("-");
		
		LocalDate dogumTarih= LocalDate.of(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		LocalDate date = LocalDate.now(); //sistemdeki tarih
		
		Period period = Period.between(dogumTarih, date);
		
		System.out.println("Gun olarak yasiniz "+period.getDays());
		System.out.println("Ay olarak yasiniz "+period.getMonths());
		System.out.println("Yil olarak yasiniz "+period.getYears());


	}
	
	public  void ay(String tarih) {
		String t[]=tarih.split("-");
		
		LocalDate birth= LocalDate.of(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		LocalDate date = LocalDate.now(); //sistemdeki tarih
		
		Long fark= ChronoUnit.MONTHS.between(birth,date);
		System.out.println("Ay olarak yasiniz:  "+fark);
		


	}
	public  String gun(String tarih) {
		String t[]=tarih.split("-");
		
		LocalDate birth= LocalDate.of(Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2]));
		LocalDate date = LocalDate.now(); //sistemdeki tarih
		
		Long fark= ChronoUnit.DAYS.between(birth,date);
		System.out.println("Gun olarak yasiniz:  "+fark);
		
		return fark.toString();


	}
}
