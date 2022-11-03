package org.example.bahavioral.command;

import org.example.bahavioral.command.commands.Command;
import org.example.bahavioral.command.commands.NoCommand;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            builder.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append("          ")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append("\n");
        }
        return builder.toString();
    }
}
