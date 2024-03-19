package service;

import dto.CreditCardRequest;
import model.CardType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class CreditCardServiceTest {

    private CreditCardService creditCardService = new CreditCardService();

    private CreditCardRequest creditCardRequest;

    @BeforeEach
    public void initializeCreditCardService(){
        creditCardService = new CreditCardService();

        creditCardRequest = new CreditCardRequest();
        creditCardRequest.setCardName("chichi");
        creditCardRequest.setCardType(CardType.MASTERCARD);
        creditCardRequest.setCardExpirationYear("2024");
        creditCardRequest.setCardCvv("123");
        creditCardRequest.setCreditCardNumber("123456789012345");
        creditCardRequest.setGetCardExpirationMonth("july");

    }

    @Test
    public void testToComfirmCreditCard(){

        assertDoesNotThrow(()->{
            creditCardService.collectCardInformation(creditCardRequest);
        });
    }

}