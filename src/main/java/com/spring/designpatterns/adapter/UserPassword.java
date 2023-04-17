package com.spring.designpatterns.adapter;

public class UserPassword implements GeneratePassword {

    @Override
    public void generate() {
        System.out.println("- User - #$½{}½$#");
    }

    @Override
    public void rollback() {
        System.out.println("- User -");
    }
}
