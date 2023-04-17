package com.spring.designpatterns.adapter;

public class AdminPassword implements GeneratePassword {

    @Override
    public void generate() {
        System.out.println("- Admin - #$½{}½$#");
    }

    @Override
    public void rollback() {
        System.out.println("- Admin -");
    }
}
