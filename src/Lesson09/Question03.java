package Lesson09;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
//		3. Kullanicidan; Dersin adi, Vize1 notu, Vize2 notu, Final notu, 3 adet 
//		de sozlu sinav notlarini alin. Bu notlari asagidaki sartlara gore tek bir
//		method’ ta varargs kullanarak donem sonu not ortalamasi olarak 
//		gosteriniz.
//		Sartlar;
//		I. Vizelerin ortalamasinin %30’ u
//		II. Final notunun %50’ si
//		III. Sozlu sinavlarin ortalamasinin %20’ si
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dersin Adi: ");
		String dersAdi= scan.nextLine();
		System.out.println("Sirasi ile Vizel Vize2 Final Sozlu1 Sozlu2 Sozlu3 Notlarini Giriniz: ");
		notOrt(dersAdi,scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
	

}
	public static void notOrt(String dersAdi, int...notlar ) {
		
		double vizeOrt=((notlar[0]+notlar[1])/2)*0.3;
		double finalOrt=notlar[2]*0.5;
		double sozluOrt=((notlar[3]+notlar[4]+notlar[5])/3)*0.2;
		double donemSonu=vizeOrt+finalOrt+sozluOrt;
		System.out.println("Donem Sonu Not Ort: "+ donemSonu);

		
	}
}