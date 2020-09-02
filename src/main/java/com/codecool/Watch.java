package com.codecool;

public class Watch extends Clock {

    String color;

    public Watch(Time time, String movement){
        this.time = time;
        this.type = "Watch";
        this.movement = movement;
        this.sound = "Tick Tock";

    }

    @Override
    public void makeSound(){
        System.out.println( type + "make a sound like this" + sound);
    }
}