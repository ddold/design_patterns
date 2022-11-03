package org.example.bahavioral.command.invoker;

import org.example.bahavioral.command.commands.Command;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() { }

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
