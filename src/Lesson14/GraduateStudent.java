package Lesson14;

import java.util.Date;

public class GraduateStudent extends Student{
	String advisor;
	String thesis;
	
	public GraduateStudent(int no, String name, int year, Date dob, String major, String thesis, String advisor) {
		super(no, name, year, dob, major);
		this.advisor= advisor;
		this.thesis= thesis;
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

	public void writeThesis() {
		
	}
	
	public void meetWithAdvisor() {
		
	}

	
	
}
