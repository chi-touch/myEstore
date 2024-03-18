package exceptions;

public class InvalidCardInformation extends RuntimeException{
    public InvalidCardInformation(String message){
        super(message);
    }
}
