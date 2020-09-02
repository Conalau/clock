package com.codecool;

public class AlarmClock extends Clock{

    public AlarmClock(Time time, String movement) {
        this.time = time;
        this.type = "Alarm Clock";
        this.movement = movement;
        this.sound = "Buzzz";

    }
    @Override
    public void makeSound(){
        System.out.println( type + "make a sound like this" + sound);
    }

}