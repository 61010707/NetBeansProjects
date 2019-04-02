/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab17;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author DrZin
 */
public class MyDate implements Serializable {

    private int year;
    private int month;
    private int day;

    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

    }

    public MyDate(long elapsedTime) {

    }

    public void setDate(long elapesdTime) {

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapesdTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return this.year;
    }

    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    @Override
    public String toString() {
        return "\nDay : " + getDay()
                + "\nMonth : " + getMonth()
                + "\nYear :  " + getYear();
    }

}
