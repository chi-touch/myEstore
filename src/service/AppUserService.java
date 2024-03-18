package service;

import model.Users;
import dto.RegisterAppUserRequest;
import model.AppUser;
import repositories.AppUserStorage;

import java.time.LocalDate;

public class AppUserService {
    private AppUserStorage appUserStorage = new AppUserStorage();




    private AppUser modelMapper(RegisterAppUserRequest registerCustomerRequest){
        if(appUserStorage.ifUserExists((registerCustomerRequest.getEmailAddress()))){
            throw  new RuntimeException( "user with the email address "+ registerCustomerRequest.getEmailAddress()+" already exits");
        }

        AppUser appUser = new AppUser();
        appUser.setEmailAddress(registerCustomerRequest.getEmailAddress());
        appUser.setName(registerCustomerRequest.getName());
        appUser.setHomeAddress(registerCustomerRequest.getHomeAddress());
        appUser.setPassword(registerCustomerRequest.getPin());
        appUser.setDateCreated(LocalDate.now());
        appUser.setPhoneNumber(registerCustomerRequest.getPhoneNumber());
        appUser.setAge(registerCustomerRequest.getAge());
        return appUser;
    }

    public String registerCustomer(RegisterAppUserRequest registerCustomerRequest) {
      AppUser appUser = modelMapper(registerCustomerRequest);
        appUser.setRole(Users.CUSTOMER);
        return appUserStorage.saveAppUser(appUser);

    }

    public String registerAdmin(RegisterAppUserRequest registerAdminRequest){

        AppUser appUser = modelMapper(registerAdminRequest);
        appUser.setRole(Users.ADMIN);
        return appUserStorage.saveAppUser(appUser);
    }

    public String registerSeller(RegisterAppUserRequest registerSellerRequest){
       AppUser appUser = modelMapper(registerSellerRequest);
        appUser.setRole(Users.SELLERS);
        return appUserStorage.saveAppUser(appUser);
    }

    public AppUser findAppUserByEmail(String email) {
        return appUserStorage.findAppUserByEmail(email);
    }

    public int getNumberOfCustomer() {
        return appUserStorage.countCustomer();
    }


}
