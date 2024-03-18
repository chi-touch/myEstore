package service;

import dto.CreateProductRequest;
import model.ProductCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    private ProductService productService = new ProductService();
    private CreateProductRequest createProductRequest;
    private CreateProductRequest createProductRequest1;

    @BeforeEach
    public void initializeProductService(){
        createProductRequest = new CreateProductRequest();
        createProductRequest.setName("tecno phone");
        createProductRequest.setCategory(ProductCategory.ELECTRONICS);
        createProductRequest.setPrice(new BigDecimal(9000));

        createProductRequest1 = new CreateProductRequest();
        createProductRequest1.setName("pot");
        createProductRequest1.setCategory(ProductCategory.UTENSILS);
        createProductRequest1.setPrice(new BigDecimal(7000));



    }

    @Test
    public void testThatProductCanBeCreated(){
        productService.createProduct(createProductRequest);
        assertEquals(1,productService.countProduct());
    }
    @Test
    public void testThatTwoProductCanBeCreated(){
        productService.createProduct(createProductRequest);
        productService.createProduct(createProductRequest1);
        assertEquals(2,productService.countProduct());
    }
    @Test
    public void testThatProductCanBeFound(){
        productService.createProduct(createProductRequest);
        productService.createProduct(createProductRequest1);
        assertEquals("pot",productService.findProduct(createProductRequest1.getName()).getName());
    }

    @Test
    public void testThatProductCanBeRemoved(){
        productService.createProduct(createProductRequest1);
        productService.removeProduct("pot");
        assertFalse(productService.ifProductExist("pot"));
    }

    @Test
    public void testThatTwoProductCanBeRemoved(){
        productService.createProduct(createProductRequest);
        productService.createProduct(createProductRequest1);
        productService.removeProduct("tech phone");
        productService.removeProduct("pot");
        assertFalse(productService.ifProductExist("tech phone"));
    }




}