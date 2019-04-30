/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLab_V;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        Vechicle car = new FourWheel(2550, 1999, "fai", "white", 25);
        Vechicle car2 = new MoreWheel(25, 250, "Zin", "White", 25);

        System.out.println("Tax of car1 is: " + (Vechicle.getCompare(car, car2) == 0 ? " equal" : Vechicle.getCompare(car, car2) == 1 ? " more than " : " less than"));
    }
}
