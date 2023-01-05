package Lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question07 {

	public static void main(String[] args) {
//			Soru 1:
//			Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop 
//			kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		Integer arr[] = new Integer[] { 1, 2, 3, 4, 5,6 };
		double carpim = 1;
		for (int w : arr) {
			carpim *= w;
		}
		System.out.println(carpim);
//			Soru 2:
//			Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each loop 
//			kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		List<Integer> list = Arrays.asList(arr);
		double toplam = 0;
		for (int w : list) {
			toplam += w * w;
		}
		System.out.println(toplam);
//			Soru 3:
//			iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak
//			bulunuz. Sonucu ekrana yazdiriniz.
//			Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
		String arr1[] = { "Ayse", "Ali", "Fatma", "Ahmet", "Elif", "Sare" };
		String arr2[] = { "Sevinc", "Ali", "Fatma", "Tarik", "Elif", "Sare" };
		int count = 0;
		System.out.println("..Ortak elemanlar.. \n");

		for (String a : arr1) {
			for (String b : arr2) {
				if (a.equals(b)) {
					System.out.println(a + " ");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Ortak eleman yok");

		}

//			Soru 4:
//			Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak yazdiriniz. 
//			ipucu: split()

		String str = "String Karakterleri...";
		String karakterler[] = str.split("");

		for (String w : karakterler) {
			System.out.print(w + " ");

		}

	}

}
