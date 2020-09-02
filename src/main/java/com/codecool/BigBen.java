package com.codecool;

public class BigBen extends Clock {

    public BigBen(Time time, String movement) {
        this.time = time;
        this.type = "BigBen";
        this.movement = movement;
        this.sound = "Big Ben";
    }


    @Override
    public void makeSound(){
        System.out.println( type + "make a sound like this" + sound);
    }

}