package repositories;

import model.AppUser;

import java.util.HashMap;

public class AppUserStorage  {

    private  HashMap<String, AppUser> appUserDataBase = new HashMap<>();

    public HashMap<String, AppUser> getAppUserDataBase() {
        return appUserDataBase;
    }

    public boolean ifUserExists(String email){
        return this.appUserDataBase.containsKey(email);
    }

    public String saveAppUser(AppUser appUser){
        this.appUserDataBase.put(appUser.getEmailAddress(), appUser);
        return "registration completed successfully";
    }

    public AppUser findAppUserByEmail(String email) {

        return this.appUserDataBase.get(email);
    }



    public int countCustomer() {
        return this.appUserDataBase.size();
    }

}
