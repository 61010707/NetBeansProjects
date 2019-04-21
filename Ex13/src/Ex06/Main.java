package Ex06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrZin
 */
/*********************************************************************************
* (The ComparableCircle class) Define a class named ComparableCircle that        *
* extends Circle and implements Comparable. Draw the UML diagram and implement   *
* the compareTo method to compare the circles on the basis of area. Write a test *
* class to find the larger of two instances of ComparableCircle objects.         *
*********************************************************************************/
public class Main {
    public static void main(String[] args) {
        ComparableCircle circle1  = new ComparableCircle(34);
        ComparableCircle circle2 = new ComparableCircle(25);
        
        System.out.println((circle1.compareTo(circle2) ==1 ? "Circle1" : "Circle2") +" is the largest circle" );
    }
}
