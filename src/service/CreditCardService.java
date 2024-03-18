package service;

import dto.CreditCardRequest;
import exceptions.InvalidCardInformation;
import model.CreditCardInformation;
import repositories.CreditCardRepository;

public class CreditCardService {
    private CreditCardRepository creditCardRepository = new CreditCardRepository();

    public boolean ifCardExit(String cardName){
        return creditCardRepository.cardExist(cardName);
    }

    public String collectCardInformation(CreditCardRequest creditCardRequest){
        if(creditCardRepository.cardExist(creditCardRequest.getCardName())){
            throw new InvalidCardInformation("your card details are wrong");
        }

        CreditCardInformation creditCardInformation = new CreditCardInformation();
        creditCardInformation.setCardName(creditCardRequest.getCardName());
        creditCardInformation.setCardCvv(creditCardRequest.getCardCvv());
        creditCardInformation.setCreditCardNumber(creditCardRequest.getCreditCardNumber());
        creditCardInformation.setCardExpirationYear(creditCardRequest.getCardExpirationYear());
        creditCardInformation.setGetCardExpirationMonth(creditCardRequest.getGetCardExpirationMonth());
        creditCardInformation.setCardType(creditCardRequest.getCardType());
        return " your credit card information collected and saved successfully";

    }
}
