package repositories;

import model.ShoppingCart;

import java.util.HashMap;

public class ShoppingCartRepository {

    public HashMap <String, ShoppingCart> listOfShopping = new HashMap<>();

    public boolean ifCustomerHaveCart(String emailAddress){
        return this.listOfShopping.containsKey(emailAddress);
    }

    public ShoppingCart findCustomerCart(String emailAddress){
        return this.listOfShopping.get(emailAddress);

    }

    public String saveShoppingOrder(ShoppingCart shoppingCart){
        this.listOfShopping.put(shoppingCart.getCustomer().getEmailAddress(),shoppingCart);
        return "added successfully";
    }





}
