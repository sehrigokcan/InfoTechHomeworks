package Lesson08;

public class Question03 {

	public static void main(String[] args) {
//		Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin 
//		toplamini ekrana yazdiran bir program yaziniz. 
		int arr1[][] = { {1,2}, {3,4,5}, {6} } ;
		int arr2[][] = { {7,8,9}, {10,11}, {12} };
		
		for (int i=0;i<3;i++) {
			int lenght=Math.min(arr1[i].length, arr2[i].length);
			for (int j=0;j<lenght;j++) {
				System.out.println(arr1[i][j]+" + "+ arr2[i][j]+ ": "+(arr1[i][j]+arr2[i][j]));
			}
		}
	}

}
