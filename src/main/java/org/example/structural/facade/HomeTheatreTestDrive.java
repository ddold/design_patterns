package org.example.structural.facade;

import org.example.structural.facade.hometheatre.Amplifier;
import org.example.structural.facade.hometheatre.CdPlayer;
import org.example.structural.facade.hometheatre.HomeTheatreFacade;
import org.example.structural.facade.hometheatre.PopcornPopper;
import org.example.structural.facade.hometheatre.Projector;
import org.example.structural.facade.hometheatre.Screen;
import org.example.structural.facade.hometheatre.StreamingPlayer;
import org.example.structural.facade.hometheatre.TheaterLights;
import org.example.structural.facade.hometheatre.Tuner;

/*
https://refactoring.guru/design-patterns/facade
 */
public class HomeTheatreTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amp");
        Tuner tuner = new Tuner("Tuner", amp);
        StreamingPlayer stream = new StreamingPlayer("Streaming", amp);
        CdPlayer cd = new CdPlayer("CD", amp);
        Projector projector = new Projector("Projector", stream);
        Screen screen = new Screen("Screen");
        TheaterLights lights = new TheaterLights("Den lights");
        PopcornPopper popper = new PopcornPopper("Popcorn");

        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(amp, tuner, stream, cd, projector, lights, screen, popper);

        homeTheatre.watchMovie("Raiders of the Lost Ark");
        homeTheatre.endMovie();
    }
}
