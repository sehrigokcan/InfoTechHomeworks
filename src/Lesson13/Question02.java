package Lesson13;

public class Question02 {
//	Bir adet checked, bir adet de unchecked manuel exception 
//	olusturun. Bu exception’ larinizi calistiracak OZGUN bir kodlama 
//	yapin. Checked exception’ inizda throws, unchecked exception’ 
//	inizda try-catch-finally kullanin.
	
	public static void main(String[] args) throws IllegalGradeException {
		
		try {
			checkNameFormat("Sehri");
		}catch(IllegalNameException e) {
			System.out.println("Isminizin bas harfi buyuk olmaliydi");
			e.printStackTrace();
		}
		
		
		printGrades(10);

		
	}

    public static void printGrades(double grade) throws IllegalGradeException {
        if(grade<0 || grade>100){
            throw new IllegalGradeException("Grade must be between 0 and 100..");
        }else {
            System.out.println(grade);
        }
    }
    

    public static void checkNameFormat(String name){
        if (name.startsWith(name.substring(0,1).toUpperCase())){
        	System.out.println("Your name is good..");
        }else{
            throw new IllegalNameException(("Name must begin with uppercase letter"));
        }
    }
	
}
