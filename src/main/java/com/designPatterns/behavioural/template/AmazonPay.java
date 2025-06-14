package com.designPatterns.behavioural.template;

public class AmazonPay extends UPI {

    public AmazonPay(String upiId) {
        super(upiId);
    }

    @Override
    public boolean makeTransaction() {
         if(this.validDateId()){
             sendConfirmation();
             return true;
         }
         return false;
    }
}
