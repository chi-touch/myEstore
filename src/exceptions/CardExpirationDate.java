package exceptions;

public class CardExpirationDate extends RuntimeException {
    public CardExpirationDate(String message){
        super(message);
    }
}
