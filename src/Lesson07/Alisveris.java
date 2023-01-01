package Lesson07;

import java.util.Arrays;
import java.util.Scanner;

public class Alisveris {
	static String[] urunler= new String[5];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Amazondan 5 adet ucretsiz urun hakki kazandiniz.\nIsteginiz 5 urunu giriniz: ");

		
		Array a1= new Array();

		String[] urunler=a1.array();
		
		for (int i=0; i<5;i++) {
			System.out.print((i+1)+". urunu giriniz: ");
			urunler[i]=scan.nextLine();
			
		}
		System.out.println("Sirasiz: \t");
		System.out.print(Arrays.toString(urunler));

		Arrays.sort(urunler);
		
		System.out.println();
		System.out.println("Sirali: \t");
	

		for (int i = 0; i < 5; i++) {
			System.out.print(urunler[i]+ " ");
		}

		
		urunler[3]="Tablet";
		
		Arrays.sort(urunler);
		if (Arrays.binarySearch(urunler, "Tablet")>=0) {
			System.out.println("\nDegisiklik yaptiginiz urun listeye eklenmistir." + urunler[3]);
		}

		System.out.print(Arrays.toString(urunler));
	}

}
