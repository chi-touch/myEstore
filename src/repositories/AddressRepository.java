package repositories;

import model.Address;

import java.util.HashMap;

public class AddressRepository {
    private HashMap<String, Address> addressDataBase = new HashMap<>();

    public HashMap<String, Address> getAddressDataBase() {
        return addressDataBase;
    }
    public boolean addressExit(String address){
        return this.addressDataBase.containsKey(address);
    }

    public String saveAddress(Address address){
        this.addressDataBase.put(address.getCountryName(),address);
        return "your address has being saved successfully";
    }

    public  int getAddress(){
        return  this.addressDataBase.size();
    }

    public Address findByEmailAddress(String emailAddress){
        return  this.addressDataBase.get(emailAddress);
    }

    //public String deleteAddress(String address){
            //return addressDataBase.remove(address);
    //}
}
