package Lesson09;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Question01 {
	/*
	 * 1. Tokyo-Kahire arasi ucak seferi duzenleyen bir hava yolu sirketi icin bilet
	 * satis programina bir ek program yazmaniz istendi. Kalkis Tokyo ve inis Kahire
	 * sehridir. Sartlar; Kullanicidan seyahat tarihi ve saati istenecek, Tokyo
	 * saatiyle kalkis saati ve tarihi, Kahire saatiyle inis saati ve tarihi
	 * verilecek. (Kullanicidan istenilen bilgileri “VeriGirisi” adiyla olusturulmus
	 * class’ tan alinip “Sonuc” adiyla olusturulmus class icinde olusturacaginiz
	 * static bir method’ tan kullaniciya sunulacaktir.)
	 */
	
	
	  public static void ucusHesaplama(String tarih, String saat) {
	        
	        
	        
	        
	        int year=Integer.parseInt(tarih.substring(6,10));  //6 ve 10 arasında string olarak girilen yıl integera çevrildi.
	        int month=Integer.parseInt(tarih.substring(3,5));
	        int day=Integer.parseInt(tarih.substring(0,2));
	        
	        int hour=Integer.parseInt(saat.substring(0,2));
	        int minute=Integer.parseInt(saat.substring(3,5));
	            
	        LocalDateTime dateTimeUser=LocalDateTime.of(year, month, day, hour, minute);
	        LocalDateTime dateTimeCairoLanding = dateTimeUser.plusHours(-7+9);  //-7 saat tokyo cairo arası saat farkı  +9 saat yolculuk süresi, o sebeple +2 yapılmadı
	        
	        System.out.println("Tokyo==> Kalkis Saatiniz:"+ saat + "\tKalkis Tarihi:"+tarih);
	        System.out.println("Cairo==> Inis Saatiniz:"+ dateTimeCairoLanding.getHour()+ ":"+ dateTimeCairoLanding.getMinute() 
	        +"\tInis Tarihi:" + dateTimeCairoLanding.getDayOfMonth()+"/"+dateTimeCairoLanding.getMonthValue()
	        +"/"+dateTimeCairoLanding.getYear());
	        
	        
	        
	        
	        
	    }
}

