package org.example.bahavioral.command;

import org.example.bahavioral.command.api.GarageDoor;
import org.example.bahavioral.command.api.Light;
import org.example.bahavioral.command.commands.GarageDoorUpCommand;
import org.example.bahavioral.command.commands.LightOnCommand;
import org.example.bahavioral.command.invoker.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
