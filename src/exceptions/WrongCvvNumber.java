package exceptions;

public class WrongCvvNumber extends RuntimeException{
    public WrongCvvNumber(String message){
        super(message);
    }
}
