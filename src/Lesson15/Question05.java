package Lesson15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Question05 {
	
//	5) Node'lari "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olusturun.
//	Kullanicidan bir isim alin.Bu isim LinkedList'de varsa silin ve kullaniciya 
//	"Bu isim LinkedList'de vardi ve silindi“diye mesaj verin.
//	Bu isim LinkedList'de yoksa "Bu isim LinkedList'de yok bu yuzden 
//	silinemedi" diye mesaj verin
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>(Arrays.asList("Ali","Veli","Can","Ayse"));
		ListIterator<String> itList = list.listIterator();
		System.out.println(list);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz.. : ");
		String isim = scan.nextLine();
		isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
		System.out.println(isim);
		String listIsim;
		
		boolean sonuc = false;
		
		while(itList.hasNext()) {
			listIsim=itList.next();
			if(listIsim.equals(isim)) {
				list.remove(isim);
				sonuc = true;
			}
		}
		if (sonuc == false) {
			 System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi..");
			}
			else System.out.println("Bu isim LinkedList'de vardi ve silindi..");
			
		scan.close();
		

	}
	
}

