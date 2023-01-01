package Lesson08;

public class Question02 {

	public static void main(String[] args) {
	
//		Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana 
//	yazdiran bir program yaziniz.
//	{ {1,2,3}, {4,5}, {6} }

	int sayilar[][]= { {1,2,3}, {4,5}, {6} };
	double carpim=1;
	for(int i=0; i<3;i++) {
		carpim*=sayilar[i][sayilar[i].length-1];
	}
	System.out.print("Dizi son elemanlari carpimi: "+ carpim);

	
	}

}
