package org.example.bahavioral.command.api;

public class Stereo {

    private String room;
    private String CD;
    private String DVD;
    private String radio;
    private int volume;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(this.room + " stereo is on");
    }

    public void off() {
        System.out.println(this.room + " stereo is off");
    }

    public void setCD(String CD) {
        this.CD = CD;
        System.out.println(this.room + " CD is set to " + CD);
    }

    public String getCD() {
        return CD;
    }

    public void setDVD(String DVD) {
        this.DVD = DVD;
        System.out.println(this.room + " DVD is set to " + DVD);
    }

    public String getDVD() {
        return DVD;
    }

    public void setRadio(String radio) {
        this.radio = radio;
        System.out.println(this.room + " radio is set to " + radio);
    }

    public String getRadio() {
        return radio;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(this.room + " volume is set to " + volume);
    }

    public int getVolume() {
        return volume;
    }
}
