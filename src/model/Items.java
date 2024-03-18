package model;

import java.time.LocalDateTime;

public class Items {
    private int quantityOfItems;
    private ProductZ product;
    private LocalDateTime timeAdded;

    public int getQuantityOfItems() {
        return quantityOfItems;
    }

    public void setQuantityOfItems(int quantityOfItems) {
        this.quantityOfItems = quantityOfItems;
    }

    public ProductZ getProduct() {
        return product;
    }

    public void setProduct(ProductZ product) {
        this.product = product;
    }

    public LocalDateTime getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(LocalDateTime timeAdded) {
        this.timeAdded = timeAdded;
    }
}
