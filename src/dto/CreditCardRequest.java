package dto;

import model.CardType;

public class CreditCardRequest {
    private int cardCvv;
    private int cardExpirationYear;
    private int getCardExpirationMonth;
    private String cardName;
    private CardType cardType;
    private int creditCardNumber;

    public int getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(int cardCvv) {
        this.cardCvv = cardCvv;
    }

    public int getCardExpirationYear() {
        return cardExpirationYear;
    }

    public void setCardExpirationYear(int cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }

    public int getGetCardExpirationMonth() {
        return getCardExpirationMonth;
    }

    public void setGetCardExpirationMonth(int getCardExpirationMonth) {
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

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


}
