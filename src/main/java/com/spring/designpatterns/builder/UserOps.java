package com.spring.designpatterns.builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserOps {

    private static final Logger log = LoggerFactory.getLogger(UserOps.class);

    User thisUser = new User.Builder("14282935516", "Umut Serdar")
            .age(30)
            .email("umut@gmail.com")
            .phoneNumber("05309213995")
            .build();

    User anotherUser = new User.Builder("162819375121", "Ahmet")
            .age(30)
            .build();


    public void saveToDatabase() {
        log.info(String.format("User saved to DB: => %s", thisUser.toString()));
        log.info(String.format("User saved to DB: => %s", anotherUser.toString()));
    }

    public static void main(String[] args) {
        UserOps userOps = new UserOps();
        userOps.saveToDatabase();
    }
}
