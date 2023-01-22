package Lesson14;

import java.util.Date;

public class PhdStudent extends GraduateStudent{
	boolean qualifyingExamTaken;


	public PhdStudent(int no, String name, int year, Date dob, String major, String thesis, String advisor, boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, thesis, advisor);
		this.qualifyingExamTaken= qualifyingExamTaken;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void register() {
		// TODO Auto-generated method stub
		super.register();
	}


	@Override
	public void study() {
		// TODO Auto-generated method stub
		super.study();
	}


	@Override
	public void writeThesis() {
		// TODO Auto-generated method stub
		super.writeThesis();
	}


	@Override
	public void meetWithAdvisor() {
		// TODO Auto-generated method stub
		super.meetWithAdvisor();
	}
	
	public void writePaper() {
		
	}
	

}
