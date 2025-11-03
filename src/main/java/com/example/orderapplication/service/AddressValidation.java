package com.example.orderapplication.service;

public class AddressValidation {

    public boolean addressValidation(String address) {
        if (address.equals(null) || address.equals("")) {
            return false;
        }
        return true;
    }


}
