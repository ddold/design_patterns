package org.example.bahavioral.command;

import org.example.bahavioral.command.api.CeilingFan;
import org.example.bahavioral.command.commands.CeilingFanHighCommand;
import org.example.bahavioral.command.commands.CeilingFanMediumCommand;
import org.example.bahavioral.command.commands.CeilingFanOffCommand;

/*
https://refactoring.guru/design-patterns/command
 */
public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControlWithUndo remote = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remote.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remote.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(1);
        System.out.println(remote);
        remote.undoButtonWasPushed();
    }
}
