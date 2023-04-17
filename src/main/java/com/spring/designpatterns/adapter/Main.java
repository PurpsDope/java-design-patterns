package com.spring.designpatterns.adapter;

public class Main {
    public static void main(String[] args) {

        GeneratePassword userGeneratePassword = new UserPassword();
        userGeneratePassword.generate();
        userGeneratePassword.rollback();

        GeneratePassword adminGeneratePassword = new AdminPassword();
        adminGeneratePassword.generate();
        adminGeneratePassword.rollback();

        GuestPassword guestPassword = new GuestPassword();

        GeneratePassword guestAdapterGeneratePassword = new GuestAdapter(guestPassword);
        guestAdapterGeneratePassword.generate();
        guestAdapterGeneratePassword.rollback();

    }
}
