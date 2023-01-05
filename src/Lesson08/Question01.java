package Lesson08;

public class Question01 {

	public static void main(String[] args) {
//		Soru1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir 
//	method yaziniz.
// 
		int sayilar[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.print("Dizi elemanlari carpimi: "+ carpim(sayilar));

	
	
	}
	
	public static double carpim(int[][] array) {
		double carpim = 1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				carpim *= array[i][j];
			}
		}
		return carpim;
	}
}
