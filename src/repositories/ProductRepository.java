package repositories;

import model.ProductZ;

import java.util.HashMap;

public class ProductRepository {
    private HashMap<String, ProductZ> productDataBase = new HashMap<>();

    public HashMap<String, ProductZ> getProductDataBase() {
        return productDataBase;
    }
    public boolean productExit(String productName){
        return this.productDataBase.containsKey(productName);
    }

    public String saveProductData(ProductZ productZ){
        this.productDataBase.put(productZ.getProductName(),productZ);
        return "product successfully registered";
    }

    public ProductZ findProductByName(String productName){
        return this.productDataBase.get(productName);
    }

    public int countProduct(){ return  this.productDataBase.size();
    }


}
