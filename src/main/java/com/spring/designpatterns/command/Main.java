package com.spring.designpatterns.command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        final Logger log = LoggerFactory.getLogger(Main.class);

        Television television = new Television();

        Command turnOnCommand = new TurnOnCommand(television);
        Command turnOffCommand = new TurnOffCommand(television);

        Controller controller = new Controller();

        controller.setOnCommand(turnOnCommand);
        controller.setOffCommand(turnOffCommand);

        controller.pressOnButton();
        controller.pressOffButton();
    }
}
