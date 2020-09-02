package com.codecool;


public abstract class Clock {

    Time time;
    String type;
    String movement;
    String sound;

    public Time getTime() {
        return this.time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMovement() {
        return this.movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract void displayTime();
    public abstract void makeSound();
    public abstract void tick();

}