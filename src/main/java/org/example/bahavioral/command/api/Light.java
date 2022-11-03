package org.example.bahavioral.command.api;

public class Light {

    private String room;

    public Light(String room) {
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void on() {
        System.out.println(room + " light is on");
    }

    public void off() {
        System.out.println(room + " light is off");
    }
}
