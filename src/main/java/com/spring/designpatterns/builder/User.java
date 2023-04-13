package com.spring.designpatterns.builder;

public class User {

    private final String identityNumber;
    private final String name;
    private final int age;
    private final String email;
    private final String phoneNumber;

    private User(Builder builder) {
        this.identityNumber = builder.identityNumber;
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder {

        private final String identityNumber;

        private final String name;
        private int age;
        private String email;
        private String phoneNumber;
        public Builder(String identityNumber, String name) {
            this.identityNumber = identityNumber;
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "identityNumber='" + identityNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
