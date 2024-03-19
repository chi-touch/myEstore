package model;

public class CreditCardInformation {
    private String cardCvv;
    private String cardExpirationYear;
    private String getCardExpirationMonth;
    private String cardName;
    private CardType cardType;

    public String getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }

    public String getCardExpirationYear() {
        return cardExpirationYear;
    }

    public void setCardExpirationYear(String cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }

    public String getGetCardExpirationMonth() {
        return getCardExpirationMonth;
    }

    public void setGetCardExpirationMonth(String getCardExpirationMonth) {
        this.getCardExpirationMonth = getCardExpirationMonth;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    private String creditCardNumber;



}
