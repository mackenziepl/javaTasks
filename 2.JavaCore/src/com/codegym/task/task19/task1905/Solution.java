package com.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Reinforce the adapter

*/

public class Solution {
    public static Map<String,String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String code = null;
            for(Map.Entry<String,String> map : countries.entrySet()){
                if(map.getValue().equals(customer.getCountryName())) {
                    code = map.getKey();
                }
            }
            return code;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String line = contact.getName();
            String [] words = line.split(", "); //or contact.getName().split(", ")[1];
            return words[1];
        }

        @Override
        public String getContactLastName() {
            String line = contact.getName();
            String [] words = line.split(", ");
            return words[0];
        }

        @Override
        public String getDialString() {
            return "callto://" + contact.getPhoneNumber().replaceAll("[()-]","");
        }
    }

    public static interface RowItem {
        String getCountryCode();        // For example: US
        String getCompany();            // For example: CodeGym Ltd.
        String getContactFirstName();   // For example: John
        String getContactLastName();    // For example: Peterson
        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.
        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John
        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}