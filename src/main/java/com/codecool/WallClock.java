package com.codecool;

public class WallClock extends Clock {

    public WallClock(Time time, String movement) {
        this.time = time;
        this.type = "WallClock";
        this.movement = movement;
        this.sound = "Cuckoo";
    }

    @Override
    public void makeSound(){
        System.out.println( type + "make a sound like this" + sound);
    }

}