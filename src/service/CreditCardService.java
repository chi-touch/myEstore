package service;

import dto.CreditCardRequest;
import exceptions.*;
import repositories.CreditCardRepository;

import java.time.LocalDate;

public class CreditCardService {
    private CreditCardRepository creditCardRepository = new CreditCardRepository();

    public boolean ifCardExit(String cardName){
        return creditCardRepository.cardExist(cardName);
    }

    public void collectCardInformation(CreditCardRequest creditCardRequest){

        if (Integer.valueOf( creditCardRequest.getCardExpirationYear()) < LocalDate.now().getYear()){
            throw new CardExpirationYear("this card has expiration");
        }

        if(Integer.valueOf(convertMonthToNumber(creditCardRequest.getGetCardExpirationMonth())) < LocalDate.now().getMonth().getValue()){
            throw new CardExpirationDate("this card has expiration");

        }
        validateCardNumber(creditCardRequest.getCreditCardNumber());
        if (cVVNumber(creditCardRequest.getCardCvv())){
            throw new WrongCvvNumber("the cvv number is wrong");
        }
        for (int i = 0; i <creditCardRequest.getCardName().length() ; i++) {
            if(!Character.isAlphabetic(creditCardRequest.getCardName().charAt(i))){
                throw new InvalidInput("it must be alphabet");
            }
        }

        String [] arrayCardType ={"MASTER","VERVE","VISA CARD","AMERICA EXPRESS"};
        for (int i = 0; i < arrayCardType.length; i++) {

            if(arrayCardType[i].equalsIgnoreCase(creditCardRequest.getCardType().name())){
                throw new InvalidInput("the spelling must be accurate");
            }

        }


    }

    public boolean cVVNumber(String cVVNumber){
        if(cVVNumber.length()!=3){
            return true;
        }
        return false;
    }

    public void validateCardNumber(String cardNumber){
        if(cardNumber.length()!=15)throw new InvalidCardNumber("the card number is not upto lenght");
        for (int i = 0; i < cardNumber.length(); i++) {
            if (!Character.isDigit(cardNumber.charAt(i))){
                throw new InvalidInput("input must be digit");

            }

        }
    }

    public String convertMonthToNumber(String month){
        String montha= month.toLowerCase();
        String number = " ";
        switch (montha){
            case "january" -> number ="1";
            case "feburauy" -> number ="2";
            case "march" -> number = "3";
            case "april" -> number = "4";
            case "may" -> number ="5";
            case "june" -> number = "6";
            case "july" -> number = "7";
            case "august" -> number = "8";
            case "september" -> number ="9";
            case  "october" -> number = "10";
            case  "noverber" -> number = "11";
            case  "december" -> number = "12";

            default -> {
                return "you entered a wrong month";
            }
        }
        return number;

    }




}
