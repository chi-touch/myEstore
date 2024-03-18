import service.AddressService;
import service.AppUserService;
import service.ProductService;

public class Main {
    AppUserService appUserService = new AppUserService();
    public static void main(String[] args) {

        ProductService productService = new ProductService();

        AddressService addressService = new AddressService();





        System.out.println("Hello world!");
    }


}