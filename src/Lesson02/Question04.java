package Lesson02;

import java.util.Scanner;

public class Question04 {
	public static void main(String[] args) {
	/*
	 * 4- Type a program which converts the hours to seconds. Hours 
value will be entered by user. (Use long)
Hint 1: second = hour x 60 x 60
Hint 2: To get long, use nextLong()
	 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the hours value: ");
		long hours=scan.nextLong();
		long seconds=hours*60*60;
		System.out.println(hours+ " hours are "+ seconds+ " seconds.");
	}
		
	}

