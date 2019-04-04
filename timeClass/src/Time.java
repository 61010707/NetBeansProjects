
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 61010707
 */
public class Time {

    private long hour;
    private long minute;
    private long second;
    private long Time;

    public Time() {
        this.Time = System.currentTimeMillis();
        this.second = TimeUnit.MILLISECONDS.toSeconds(this.Time);
        this.minute = TimeUnit.MILLISECONDS.toMinutes(this.Time);
        this.hour = TimeUnit.MILLISECONDS.toHours(this.Time);
    }

    public Time(long elaspseTime) {
        this.second = TimeUnit.MILLISECONDS.toSeconds(elaspseTime);
        this.minute = TimeUnit.MILLISECONDS.toMinutes(elaspseTime);
        this.hour = TimeUnit.MILLISECONDS.toHours(elaspseTime);

    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long Time) {
        this.Time = Time;
    }

}
