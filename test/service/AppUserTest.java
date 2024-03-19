package service;

import dto.RegisterAppUserRequest;
import model.AppUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppUserTest {
    private AppUser appUser;

    private final AppUserService appUserService = new AppUserService();
    private RegisterAppUserRequest registerCustomerRequest;
    private RegisterAppUserRequest registerAdminRequest;
    private RegisterAppUserRequest registerSellerRequest;
    private  RegisterAppUserRequest registerCustomerRequest1;




    @BeforeEach
    void setUp() {

        appUser = new AppUser();
        registerCustomerRequest = new RegisterAppUserRequest();
        registerCustomerRequest.setName("chi chi");
        registerCustomerRequest.setPin("56754");
        registerCustomerRequest.setPhoneNumber("88708-989=");
        registerCustomerRequest.setEmailAddress("chichi@gmail");

        registerCustomerRequest1 = new RegisterAppUserRequest();
        registerCustomerRequest1.setName("chinsom");


        registerAdminRequest = new RegisterAppUserRequest();
        registerAdminRequest.setName("admin");
        registerAdminRequest.setPin("23456");
        registerAdminRequest.setPhoneNumber("0923-4183=@");
        registerAdminRequest.setEmailAddress("@admin");

        registerSellerRequest = new RegisterAppUserRequest();
        registerSellerRequest.setName("sam");
        registerSellerRequest.setPin("23451");
        registerSellerRequest.setPhoneNumber("0923-4183=@er");
        registerSellerRequest.setEmailAddress("@adminwe");


    }
    @Test
    void testThatCustomerCanBeRegistered(){
        appUserService.registerCustomer(registerCustomerRequest);
        AppUser foundAppUser =  appUserService.findAppUserByEmail("chichi@gmail");
        assertEquals("chichi@gmail",foundAppUser.getEmailAddress());
    }

    @Test
    void testThatAdminCanBeAdminRegistered(){
        appUserService.registerAdmin(registerAdminRequest);
        assertEquals("@admin", appUserService.findAppUserByEmail("@admin").getEmailAddress());
    }

    @Test
    void testThatSellerCanBeRegistered(){
        appUserService.registerSeller(registerSellerRequest);
        assertEquals("@adminwe",appUserService.findAppUserByEmail("@adminwe").getEmailAddress());
    }

    @Test
    void testThatTwoCustomerCanBeRegistered(){
        appUserService.registerCustomer(registerCustomerRequest);
        appUserService.registerCustomer(registerCustomerRequest1);
        assertEquals(2,appUserService.getNumberOfCustomer());
    }

    @Test
    void  testForLogin(){
        appUserService.registerCustomer(registerCustomerRequest);
        appUserService.login("chichi","1234");
        assertEquals(1,appUserService.findAppUserByEmail("chichi@gmail.com"));
    }


}