/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

import java.util.GregorianCalendar;

/**
 *
 * @author DrZin
 */
public final class MyDate {

    private int year;
    private int month;
    private int day;

    /**
     * Creates a MyDate object for the current date
     */
    public MyDate() {
        GregorianCalendar calander = new GregorianCalendar();
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }

    /**
     * Creates a MyDate object with a specified elapsed time since midnight,
     * January 1, 1970, in milliseconds
     * @param elapsedTime
     */
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    /**
     * Creates a MyDate object with the specified year, month, and day
     * @param year
     * @param month
     * @param day
     */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Return year
     *
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * Return month
     *
     * @return
     */
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    /**
     * Return day
     *
     * @return
     */
    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    /**
     * Sets a new date for the object using the elapsed time
     *
     * @param elapsedTime
     */
    public void setDate(long elapsedTime) {
        GregorianCalendar calander = new GregorianCalendar();
        calander.setTimeInMillis(elapsedTime);
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
