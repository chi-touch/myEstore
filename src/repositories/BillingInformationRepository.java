package repositories;

import model.BillingInformation;

import java.util.HashMap;

public class BillingInformationRepository {

    private HashMap<String,BillingInformation> billingInfoDataBase = new HashMap<>();

    public HashMap<String, BillingInformation> getBillingInfoDataBase() {
        return billingInfoDataBase;
    }

    public boolean IfReceiverNameExit(String receiverName){
        return this.billingInfoDataBase.containsKey(receiverName);
    }

    public String saveReceiverName(BillingInformation billingInformation){
        this.billingInfoDataBase.put(billingInformation.getReceiverName(), billingInformation);
        return "receiver name saved successfully";
    }

    public BillingInformation findByCreditCardInfo(String receiverName){
        return this.billingInfoDataBase.get(receiverName);
    }


}
