package Lesson16;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class Question01 {
	//TreeMap classini kullanarak nesne uretiniz. Asagidaki 
	//	hazir metotlarin ne is yaptigini gosteriniz. 
	//	1) ceilingEntry(key); 
	//	2) descendingKeySet();
	//	3) firstEntry(); 
	//	4) floorEntry(key); 
	//	5) headMap(key);
	//	6) headMap(key,true); 
	//	7) tailMap(key); 
	//	8) tailMap(key,false);
	
	public static void main(String[] args) {
	
	  TreeMap<String ,Double> salaries= new TreeMap<String ,Double>();;

	  salaries.put("Tom Hanks",3000.00);
      salaries.put("Mary Star",1000.00);
      salaries.put("Jimmy Jones",5000.00);
      salaries.put("Kevin Bridgeman",6000.00);

      System.out.println(salaries);
      

      
  	//	1) ceilingEntry(key); 
      
   // ceilingEntry var olan key ile kullanilirsa o keyi verir. Var olmayan bir key ile kullanilirsa bir sonrakini verir.

      Map.Entry<String,Double> map7=salaries.ceilingEntry("Mary Star");
      System.out.println("CeilingEntry is: "+ map7); //Mary Star=1000.0
      
  	//	2) descendingKeySet();
      // degerleri sete ekler 
      NavigableSet set1 = salaries.descendingKeySet();
      System.out.println("Navigable set values are: " + set1); //[Tom Hanks, Mary Star, Kevin Bridgeman, Jimmy Jones]


  	//	3) firstEntry(); 
      //Siralamada ilk keyi ve degerini dondurur 
      System.out.println("Lowest Entry is: " + salaries.firstEntry());  //Jimmy Jones=5000.0
      
      
  	//	4) floorEntry(key); 
      // varsa aynisini yoksa bir oncekini verir
      
      Map.Entry<String,Double> map9=salaries.floorEntry("Mary Star");
      System.out.println("Floor Entry is: " + map9); //Mary Star=1000.0
      
  	//	5) headMap(key);
      // Siralayip verilen key degeri haric map degerlerini alir

  	//	6) headMap(key,true); 
    // Siralayip verilen key degeri dahil map degerlerini alir
      
      TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();

      t1.put(1, "Let's");
      t1.put(5, "see");
      t1.put(2, "TreeMap class");
      t1.put(27, "methods");
      t1.put(9, "in java.");

      System.out.println("The existing treemap(true) is: " + t1.headMap(9,true)); //{1=Let's, 2=TreeMap class, 5=see, 9=in java.}
      System.out.println("The existing treemap is: " + t1.headMap(9));  //{1=Let's, 2=TreeMap class, 5=see}
      
  	//	7) tailMap(key); 
      //Parametre olarak aldigi keyden sonuna kadar mapi yazdirir
      
      //	8) tailMap(key,false);
     // tailMap verilen keyden basalayarak sona kadar tum entryleri size verir ama sizin verdiginiz keyi haric tutar.
      
      SortedMap<String,Double> map1= salaries.tailMap("Kevin Bridgeman");
      System.out.println("Tail MAp: "+ map1); //{Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}
      
      NavigableMap<String,Double> map2=salaries.tailMap("Kevin Bridgeman",false);
      System.out.println(map2); //{Mary Star=1000.0, Tom Hanks=3000.0}
      
      
      System.out.println("Tail Map: " +t1.tailMap(9)); //Tail Map: {9=in java., 27=methods}
      System.out.println("Tail Map(false): " +t1.tailMap(9,false)); // {27=methods}
	}


}
