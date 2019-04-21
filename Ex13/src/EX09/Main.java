/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX09;

/**
 *
 * @author DrZin
 */
/*********************************************************************************
* (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend  *
* GeometricObject and implement the Comparable interface. Override the equals    *
* method in the Object class. Two Circle objects are equal if their radii are    *
* the same. Draw the UML diagram that involves Circle, GeometricObject, and      *
* Comparable.                                                                    *
*********************************************************************************/
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(25);
        Circle circle2 = new Circle(25);
        
        System.out.println(circle1.equals(circle2)==true ? "is Equal " : " not equal");
    }
}
