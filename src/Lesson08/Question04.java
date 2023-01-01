package Lesson08;

import java.util.Arrays;

public class Question04 {

	public static void main(String[] args) {
//		Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini birer 
//	birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir 
//	program yaziniz.
//	Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=64+5=96+7=13==>output:{6,9,13}
		int toplamlar[]=new int[3];
		
		int a1[][]={{1,2,3},{4,5},{6,7}};
		
		for (int i=0;i<3;i++) {
			int toplam=0;
			for (int j=0;j<a1[i].length;j++)
			{
			toplam+=a1[i][j];
			}
			toplamlar[i]=toplam;
		}
		System.out.println(Arrays.toString(toplamlar));
		
	}

}
