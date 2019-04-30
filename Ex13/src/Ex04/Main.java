/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(25);
        GeometricObject circle2 = new Circle(25);
        System.out.println(GeometricObject.max(circle1, circle2).toString());
        System.out.println(GeometricObject.equals(circle2, circle1));
        
    }
}
