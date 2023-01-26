package Lesson15;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question05 {
	
//	5) Node'lari "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olusturun.
//	Kullanicidan bir isim alin.Bu isim LinkedList'de varsa silin ve kullaniciya 
//	"Bu isim LinkedList'de vardi ve silindi“diye mesaj verin.
//	Bu isim LinkedList'de yoksa "Bu isim LinkedList'de yok bu yuzden 
//	silinemedi" diye mesaj verin
	public static void main(String[] args) {
		
		LinkedList<String> list= new LinkedList<>();
		
		list.add("Ali");
		list.add("Veli");
		list.add("Can");
		list.add("Ayse");
		
        System.out.println(list);

		Scanner scan= new Scanner(System.in);
		String isim= scan.next();
		
//		
//		
//		if(list.contains(isim)) {
//			list.remove(isim);
//			System.out.println("Bu isim LinkedList'de vardi ve silindi");
//		}else {
//			System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
//		}
//		
//		
//		scan.close();
		

	}
	
}

