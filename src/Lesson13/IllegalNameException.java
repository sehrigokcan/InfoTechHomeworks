package Lesson13;

public class IllegalNameException extends RuntimeException{ //Unchecked Exception


    public IllegalNameException(String message) {
        super(message);
    }
    public IllegalNameException() {
        super();
    }
}



