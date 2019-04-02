/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab17;

import java.util.GregorianCalendar;

/**
 *
 * @author DrZin
 */
public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(long elapsedTime) {

        setDate(elapsedTime);
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0 +m" : m);
    }

    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    private void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

    }

}
