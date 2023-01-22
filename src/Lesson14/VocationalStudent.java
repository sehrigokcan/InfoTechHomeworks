package Lesson14;

import java.util.Date;

public class VocationalStudent extends Student{

	
	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void study() {
		// TODO Auto-generated method stub
		super.study();
	}



	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return String.format("VocationalStudent []");
	}
	
}
