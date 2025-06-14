package com.designPatterns.behavioural.template;

public class GPay extends UPI{

    public GPay(String upiId){
        super(upiId);
    }

    @Override
    public boolean makeTransaction() {
        if(!this.validDateId()){
            sendConfirmation();
            return true;
        }
        return false;
    }
}
