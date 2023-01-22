package Lesson14;

import java.util.Date;

public class UndergraduateStudent extends Student{
	String minor;

	public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor= minor;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void study() {
		// TODO Auto-generated method stub
		super.study();
	}


	@Override
	public String toString() {
		return String.format(
				"UndergraduateStudent [minor=%s, no=%s, name=%s, year=%s, dob=%s, major=%s]",
				minor, no, name, year, dob, major);
	}



	
	

}
