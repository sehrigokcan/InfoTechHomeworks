package Lesson13;

import java.util.Scanner;

public class Question01 {
//	Kullanicidan TC kimlik numarasini isteyin. Bu kimlik numarasinin son
//	rakaminin cift rakam olarak bittigini ve Tc kimlik numarasinin 11 
//	haneden olustugunu kontrol eden non- static bir method’ ta kontrol 
//	edin. Aksi durumda IllegalArgumentException olusturun. Kontrol 
//	edeceginiz son rakami ve 11 haneyi ic ice try-catch kullanarak 
//	yapin. Finally blogunda Scanner’ i kapatin
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		try {
			System.out.print("Tc Kimlik No: ");
			String tc= scan.next();
			try {
				Question01 question01 = new Question01();
				question01.control(tc);
			}catch(IllegalArgumentException e) {
				System.out.println("Tc No Not illegal.. ");
				e.printStackTrace();
			}
		
		}
		catch(Exception e) {
			System.out.println("Error has been taken..");
			e.printStackTrace();
			
		}
		finally {
			scan.close();
		}
	}
	
	public void control(String tc) {
	
		Integer lastNumber= Integer.valueOf(tc.charAt(tc.length()-1));

		if (lastNumber%2==0 && tc.length()==11) {
			 System.out.println("TC no = "+tc);

		}else {
			 throw new IllegalArgumentException("Tc kimlik numaraniz uygun degildir.");
		}
		
	}

}
