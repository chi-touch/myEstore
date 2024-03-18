package repositories;

import model.CreditCardInformation;

import java.util.HashMap;

public class CreditCardRepository {
    private HashMap <String, CreditCardInformation> cardInfoDataBase = new HashMap<>();

    public HashMap<String, CreditCardInformation> getCardInfoDataBase() {
        return cardInfoDataBase;
    }
    public boolean cardExist(String cardName){
        return this.cardInfoDataBase.containsKey(cardName);
    }
    public CreditCardInformation findByName(String cardName){
        return this.cardInfoDataBase.get(cardName);
    }


}
