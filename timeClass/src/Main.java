/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010707
 */
public class Main {

    public static void main(String[] args) {
        Time time1 = new Time(555550000);
        Time time2 = new Time();
        System.out.println(time2.getHour() + " : " + time2.getMinute() + " : " + time2.getSecond() + ".");
        System.out.println(time1.getHour() + " : " + time1.getMinute() + " : " + time1.getSecond() + ".");
    }
}
