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
	
	
public static void veriGirisi() {
	Scanner scan= new Scanner(System.in);
	System.out.println("Kalkis Tarihini giriniz: ");
	VeriGirisi.kalkisTarihi= scan.next();
	System.out.println("Kalkis Saatini giriniz: ");
	VeriGirisi.kalkisSaati= scan.next();
	
    LocalDateTime tokyo= LocalDateTime.ofInstant(ZoneId.of("Asia/Tokyo"));
    LocalDateTime cairo= LocalDateTime.now(ZoneId.of("Afrika/Cairo"));
    Long diff= ChronoUnit.HOURS.between( tokyo,cairo);
    
    
	
	
}
}

