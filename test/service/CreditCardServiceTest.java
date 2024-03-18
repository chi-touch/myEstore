package service;

import dto.CreditCardRequest;
import model.CardType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditCardServiceTest {

    private CreditCardService creditCardService = new CreditCardService();

    private CreditCardRequest creditCardRequest;

    @BeforeEach
    public void initializeCreditCardService(){
        creditCardService = new CreditCardService();

        creditCardRequest = new CreditCardRequest();
        creditCardRequest.setCardName("chichi");
        creditCardRequest.setCardType(CardType.MASTERCARD);
        creditCardRequest.setCardExpirationYear(2024);

    }

    @Test
    public void testToComfirmCreditCard(){
        creditCardService.ifCardExit("chichi");
        creditCardService.collectCardInformation(CardType.MASTERCARD);
    }

}