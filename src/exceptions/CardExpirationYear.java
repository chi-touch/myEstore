package exceptions;

public class CardExpirationYear extends RuntimeException{
    public CardExpirationYear(String message){
        super(message);
    }
}
