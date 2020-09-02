package com.codecool;

public class Time{
    int hour;
    int minute;
    int second;

    public Time(int h, int m, int s){
        if(h >=1 && h <= 23) {
            hour = h;
        } else {
            hour = 0;
        }
        if(m >=1 && m <= 59){
            minute = m;
        } else {
            minute = 0;
        }
        if(s >=1 && s <= 59){
            second = s;
        } else {
            second = 0;
        }
    }


    public int getDifference() {
        int minute1 = getMinutesAsSeconds();
        int minute2 = getMinutesAsSeconds();
        int hour1 = getHoursAsSeconds();
        int hour2 = getHoursAsSeconds();

        
    }

    
    public int getMinutesAsSeconds() {
        int currentMinutes = 0;
        
        if((second /60) > 0) {
            currentMinutes = (second/60);
            second = second - currentMinutes*60;
        }
        return currentMinutes;
    }

    public int getHoursAsSeconds() {
        int currentHours = 0;
        minute = second/60;

        if((minute/60) > 0) {
                currentHours = (minute/60);
                minute = minute - currentHours*60;
            }
        return currentHours;

    }
}