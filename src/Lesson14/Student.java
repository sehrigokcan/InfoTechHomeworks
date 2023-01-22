package Lesson14;

import java.util.Date;

public abstract class Student {
	int no;
	String name;
	int year;
	Date dob;
	String major;
	
	public Student(int no, String name, int year, Date dob, String major) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}
	
	public void study() {
		
	}
	
	public abstract void register();

	@Override
	public String toString() {
		return String.format("Student [no=%s, name=%s, year=%s, dob=%s, major=%s]", no, name, year, dob, major);
	}
	


}
