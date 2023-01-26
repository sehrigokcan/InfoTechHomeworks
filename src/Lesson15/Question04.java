
package Lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question04 {
//	Bir listedeki istenen sayi araliginda olmayan elementleri silen bir 
//	program yaziniz ... (2. liste olusturmadan, gecerli liste uzerinde islem 
//	yapiniz)
//	Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
//	output: [23,40]  (Iterator kullanilacak)
	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>(Arrays.asList(2,13,56,23,45,14,40));
		
		Iterator<Integer> Ilist= list.iterator();
		
		System.out.println(list);

		while(Ilist.hasNext()) {
			Integer deger= Ilist.next();
			if(deger<20 || deger>40) {
				Ilist.remove();
			}
		}
		
		
		System.out.println(list);

		
	}

}
