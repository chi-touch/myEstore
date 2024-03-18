package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Items> listOfItems = new ArrayList<>();
    private LocalDateTime timeCreated;
    private AppUser customer;

    public List<Items> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(List<Items> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public AppUser getCustomer() {
        return customer;
    }

    public void setCustomer(AppUser customer) {
        this.customer = customer;
    }
}
