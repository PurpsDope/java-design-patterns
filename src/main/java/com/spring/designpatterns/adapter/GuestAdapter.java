package com.spring.designpatterns.adapter;

public class GuestAdapter implements GeneratePassword {

    private GuestPassword guestPassword;

    public GuestAdapter(GuestPassword guestPassword) {
        this.guestPassword = guestPassword;
    }

    @Override
    public void generate() {
        guestPassword.adjust();
    }

    @Override
    public void rollback() {
        guestPassword.undo();
    }
}
