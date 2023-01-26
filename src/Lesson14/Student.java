package Lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Student {
	int no;
	String name;
	int year;
	Date dob= new Date();
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
	
	public static Date StringToDate(String s){

	    Date result = null;
	    try{
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        result  = dateFormat.parse(s);
	    }

	    catch(ParseException e){
	        e.printStackTrace();

	    }
	    return result ;
	}
	
	public static void main(String[] args) {
		
		Date date = StringToDate("2015-12-06 17:03:00");
		System.out.println(date);

	}
	



}
