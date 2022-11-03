package org.example.bahavioral.command.commands;

import org.example.bahavioral.command.api.Stereo;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD("Bruce Springsteen");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
