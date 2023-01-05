package Lesson09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
//		4. Kullanicidan adini, soy adini isteyin ve onu “Hosgeldin Ad Soyad” 
//		seklinde selamlayin. Tc kimlik numarasini talep edin ve kullaniciya 
//		tc’ sinin 1. , 4. ve 9. rakamlarini gosterip onaylatin.
//		16 haneli kredi kardi numarasini isteyip ekranda son dort hanesi 
//		gorunecek sekilde yazdirin(**** ****  **** 5434) .Tum islemleri 
//		StringBuilder kullanarak yapiniz. Bu programin en basinda zamani 
//		alin ve islemler tamamlaninca tekrar zaman alin ve arada gecen 
//		sureyi ekrana “Islemler ..... surede tamamlandi.” Ibaresini gosterip programi tamamlayin
		
		LocalDateTime dateTime1 = LocalDateTime.now();
		
		StringBuilder ad=new StringBuilder();
		StringBuilder soyad=new StringBuilder();
		StringBuilder tcc=new StringBuilder();
		StringBuilder kart=new StringBuilder();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Adiniz: ");
		 ad.append(scan.nextLine());
		System.out.println("Soyadiniz: ");
		 soyad.append(scan.nextLine());



		System.out.println("Hosgeldin "+ ad+ " "+ soyad);
		
		while(true) {
		scan.nextLine(); //? 

		System.out.println("TC: ");
		//scan.nextLine(); //? 
		String tc=scan.nextLine();
		tcc.append(tc);
		System.out.println("TC  1., 4. ve 9. rakamlari : " +tc.charAt(0)+" "+tc.charAt(3)+" "+tc.charAt(8));
		System.out.println("Dogruysa e, yanlissa h giriniz..");
		char kontrol= scan.next().charAt(0);
		if(kontrol=='e') {
		System.out.println("tc numaraniz onaylandi");
		break;
		}
		else if(kontrol=='h') {
			System.out.println("tc numaraniz onaylanmadi..");
			continue;
		}else {
			System.out.println("Yanlis bir ifade girdiniz..");
			continue;
		}
		}
		
		System.out.println("Kredi karti: (**** ****  **** ----)");
		scan.nextLine();
		String kartNo=scan.nextLine();
		kart.append(kartNo);
		System.out.println("kart-no : " + kartNo.substring(0, kartNo.length() - 4).replaceAll("\\S", "*")
				+ kartNo.substring(kartNo.length() - 4));
		LocalDateTime dateTime2 = LocalDateTime.now();
	    Long diff = ChronoUnit.SECONDS.between(dateTime1, dateTime2);
	    
		System.out.println("Islemler  "+ diff + " sn surede tamamlandi..");

		

	}
	}


