package service;

import dto.CreateAddressRequest;
import model.Address;
import exceptions.InvalidAddressException;
import repositories.AddressRepository;

public class AddressService {

    private AddressRepository addressRepository = new AddressRepository();

    public boolean ifAddressExist(String houseAddress){
        return this.addressRepository.addressExit(houseAddress);
    }

    public String creatAddress(CreateAddressRequest createAddressRequest){
        if(addressRepository.addressExit(createAddressRequest.getEmailAddress())){
            throw new InvalidAddressException("This address is wrong");
        }
        Address address = new Address();
        address.setState(createAddressRequest.getState());
        address.setCountryName(createAddressRequest.getCountryName());
        address.setHouseNumber(createAddressRequest.getHouseNumber());
        address.setEmailAddress(createAddressRequest.getEmailAddress());
        address.setCityName(createAddressRequest.getCityName());
        address.setStreet(createAddressRequest.getStreet());
        addressRepository.getAddressDataBase().put(address.getCountryName(),address);
        addressRepository.saveAddress(address);
        return "address successfully created";

    }

    public Address findAddress(String houseAddress){
        Address foundAddress = new Address();
        if(houseAddress == null){
            throw new InvalidAddressException("this address is wrong try again when you remember your address");
        }
        return foundAddress;

    }

    public int getAddress() {
        return addressRepository.getAddress();
    }

    public String removeAddress(String addressName) {
        if(addressRepository.addressExit(addressName)){
            addressRepository.getAddressDataBase().remove(addressName);
        }
        if(!addressRepository.addressExit(addressName)){
            return "address was deleted successfully";
        }
        return "this operation can not be completed, try again";

    }
}
