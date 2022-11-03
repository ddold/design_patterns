package org.example.bahavioral.command.api;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String room;
    private int speed;

    public CeilingFan(String room) {
        this.room = room;
        this.speed = OFF;
    }

    public String getRoom() {
        return room;
    }

    public void off() {
        System.out.println(room + " ceiling fan is off");
    }

    public void high() {
        this.speed = HIGH;
        System.out.println(room + " ceiling fan is set to high");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println(room + " ceiling fan is set to medium");
    }

    public void low() {
        this.speed = LOW;
        System.out.println(room + " ceiling fan is set to low");
    }

    public int getSpeed() {
        String fanSpeed = "";
        if (this.speed == 0) {
            fanSpeed = "off";
        } else if (this.speed == 1) {
            fanSpeed = "low";
        } else if (this.speed == 2) {
            fanSpeed = "medium";
        } else {
            fanSpeed = "high";
        }
//        System.out.println("The speed of the " + room + " ceiling fan is " + fanSpeed);
        return this.speed;
    }
}
