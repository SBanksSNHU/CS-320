package org.example;

import java.util.Scanner;

public class Contact {
    static final int MAX_LENGTH = 10;
    static final int MAX_ADDRESS_LENGTH = 30;


    // Awesome no default values in Java...
    private String user_ID;                 // Cannot be longer than 10 chars, cannot be Null, and not updatable
    private String first_name;              // Cannot be longer than 10 chars, cannot be Null
    private String last_name;               // Cannot be longer than 10 chars, cannot be Null
    private String phone_number;            // Must be 10 digits, cannot be Null
    private String user_address;            // Cannot be longer than 30 characters, cannot be Null

    public Contact(String userId, String first, String last, String phone, String address) {
        this.setUser_ID(userId);
        this.setFirst_name(first);
        this.setLast_name(last);
        this.setPhone_number(phone);
        this.setUser_address(address);
        /* TODO: Doesn't check if there are numbers in the name(or letters in phone number).
            But there's nothing saying there can't be :) */


    }


    public String getUser_ID() {
        return user_ID;
    }

    private void setUser_ID(String user_ID) { // Private so it can't be accessed outside of class
        //Scanner myObj = new Scanner(System.in);
        //boolean is_id_valid = false;
        //while(!is_id_valid){
        System.out.println("Input a valid ID.");
            //String userID = myObj.nextLine();
        if(user_ID.length() <= MAX_LENGTH && !user_ID.isBlank()) {
            this.user_ID = user_ID;
            //is_id_valid = true;
        }
        System.out.println("First name accepted!");

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        //Scanner myObj = new Scanner(System.in);
        //boolean is_first_valid = false;
        //while(!is_first_valid){
        System.out.println("Input a valid first name.");
            //String first = myObj.nextLine();
        if(first_name.length() <= MAX_LENGTH && !first_name.isBlank()) {
            this.first_name = first_name;
            //is_first_valid = true;
        }


        System.out.println("First name accepted!");
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        //Scanner myObj = new Scanner(System.in);
        //boolean is_last_valid = false;
        //while(!is_last_valid){
        System.out.println("Input a valid last name.");
            //String last = myObj.nextLine();
        if(last_name.length() <= MAX_LENGTH && !last_name.isBlank()) {
            this.last_name = last_name;
            //is_last_valid = true;
        }


        System.out.println("Last name accepted!");

    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        //Scanner myObj = new Scanner(System.in);
        //boolean is_number_valid = false;
        //while(!is_number_valid){
        System.out.println("Input a valid phone number.");
            //String phone = myObj.nextLine();
        if(phone_number.length() == MAX_LENGTH && !phone_number.isBlank()) {
            this.phone_number = phone_number;
            //is_number_valid = true;
        }


        System.out.println("Phone number accepted!");

    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        //Scanner myObj = new Scanner(System.in);
        //boolean is_address_valid = false;
        //while(!is_address_valid){
        System.out.println("Input a valid address.");
            //String address = myObj.nextLine();
        if(user_address.length() <= MAX_ADDRESS_LENGTH && !user_address.isBlank()) {
            this.user_address = user_address;
            //is_address_valid = true;

        }
        System.out.println("Address accepted!");
    }
}
