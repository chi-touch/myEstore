package service;

import dto.CreateAddressRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceTest {
    private AddressService addressService;
    private CreateAddressRequest createAddressRequest;
    private CreateAddressRequest createAddressRequest1;

    @BeforeEach
    public void  initializeAddressService(){
        addressService = new AddressService();
        createAddressRequest = new CreateAddressRequest();
        createAddressRequest.setEmailAddress("chichi@gmail.com");
        createAddressRequest.setCountryName("Nigeria");

        createAddressRequest1 = new CreateAddressRequest();
        createAddressRequest1.setEmailAddress("ama@gmail.com");
        createAddressRequest1.setState("Lagos");
    }

    @Test
    public void testToGetOneAddress(){
        addressService.creatAddress(createAddressRequest);
        assertEquals(1,addressService.getAddress());
    }
    @Test
    public void testToCollectTwoAddress(){
        addressService.creatAddress(createAddressRequest);
        addressService.creatAddress(createAddressRequest1);
        assertEquals(2,addressService.getAddress());
    }

    @Test
    public void testToDeleteAnAddress(){
        addressService.creatAddress(createAddressRequest);
        addressService.creatAddress(createAddressRequest1);
        addressService.removeAddress("Nigeria");
        assertEquals(1,addressService.getAddress());
    }

}