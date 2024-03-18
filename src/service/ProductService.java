package service;

import dto.CreateProductRequest;
import model.ProductZ;
import exceptions.InvalidProductException;
import repositories.ProductRepository;

import java.time.LocalDate;

public class ProductService {

    private ProductRepository productRepository = new ProductRepository();


    public boolean ifProductExist(String productName){
        return productRepository.productExit(productName);
    }

   public String createProduct(CreateProductRequest createProductRequest){
       if(productRepository.productExit(createProductRequest.getName())){throw new RuntimeException("product the name" + createProductRequest.getName() + "already exist");
       }
       ProductZ productZ = new ProductZ();
       productZ.setName(createProductRequest.getName());
       productZ.setCategory(createProductRequest.getCategory());
       productZ.setPrice(createProductRequest.getPrice());
       productZ.setDateCreated(LocalDate.now());
       productRepository.getProductDataBase().put(productZ.getName(),productZ);
       productRepository.saveProductData(productZ);
       return  "product created successfully";
   }

   public  int countProduct(){
       return productRepository.countProduct();
   }

    public ProductZ findProduct(String productName) {
       ProductZ foundProduct =productRepository.findProductByName(productName);
       if(foundProduct == null){
           throw new InvalidProductException("This product does not exit");
       }
       return foundProduct;
    }

    public String removeProduct(String productName) {
        if (productRepository.productExit(productName)){
            productRepository.getProductDataBase().remove(productName);
        }

        if (!productRepository.productExit(productName)){
            return "product "+productName+"  deleted successfully";
        }

        return  "operation can not be completed at the moment please try again later ";

    }
}
