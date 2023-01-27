package Lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question03 {
	
	public static void main(String[] args) {
		
//		Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin.
//		(ListIterator kullanilacak
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		ListIterator<Integer> itr = list.listIterator();
		
		  while(itr.hasNext()){
	            itr.next();
	        }

	        while(itr.hasPrevious()){
	            int el = itr.previous();
	            System.out.print(el + " ");
	        }

		
		
	}

}
