import dto.RegisterAppUserRequest;
import service.AppUserService;

import java.util.Scanner;

public class Main {
 static Scanner scanner = new Scanner(System.in);
    private static AppUserService appUserService = new AppUserService();
    public static void main(String[] args) {








    }
public static void bigMain(){
    System.out.println("""
            welcome to chi chi estore
            
    1) to register as a customer
    2) to register as a seller
    3) to register as admin
    4) to create product 
            """);
}
public static void registerCustomer(){
    System.out.println("enter your  name");
    String name  = scanner.next();
    System.out.println("enter your  email address");
    String emailAddress  = scanner.next();
    System.out.println("enter your  password");
    String password  = scanner.next();
    System.out.println("enter your  pin");
    String pin  = scanner.next();
    System.out.println("enter your  home address");
    String homeAddress  = scanner.next();
    System.out.println("enter your phone number");
    String phoneNumber = scanner.next();

    RegisterAppUserRequest registerAppUserRequest = new RegisterAppUserRequest();
    registerAppUserRequest.setName(name);
    registerAppUserRequest.setEmailAddress(emailAddress);
    registerAppUserRequest.setPin(pin);
    registerAppUserRequest.setPhoneNumber(phoneNumber);
    registerAppUserRequest.setPassword(password);
    registerAppUserRequest.setHomeAddress(homeAddress);
    System.out.println(appUserService.registerCustomer(registerAppUserRequest));
    bigMain();
    }







}