package exceptions;

public class InvalidCardNumber extends RuntimeException{
    public  InvalidCardNumber(String message){
        super(message);
    }
}
