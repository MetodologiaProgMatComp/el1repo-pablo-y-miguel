package es.uah.matcomp.mp.e1.ejerciciosclases;
import java.text.SimpleDateFormat;
public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        if (0 <= hour && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Horas no válidas");
        }
        if (0 <= minute && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Minutos no válidos");
        }
        if (0 <= second && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Segundos no válidos");
        }
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",hour, minute, second);
    }
    public Time nextSecond(){
        second = second + 1;
        if (second>=60){
            second = 0;
            minute= minute+1;
            if (minute >= 60){
                minute = 0;
                hour = hour + 1;
                if (hour >=24){
                    hour= 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond(){
        second = second - 1;
        if (second< 0){
            second = 59;
            minute= minute - 1;
            if (minute < 0){
                minute = 59;
                hour = hour - 1;
                if (hour < 0){
                    hour= 23;
                };
            }
        }
        return this;
    }

}
