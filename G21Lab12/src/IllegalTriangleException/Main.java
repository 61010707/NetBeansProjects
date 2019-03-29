/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IllegalTriangleException;

import java.util.Scanner;

/**
 *
 * @author 61010707
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Input Color : ");
        String colorString = inputScanner.next();

        System.out.println("isFilled (true / false ) : ");
        boolean filled = inputScanner.nextBoolean();

        System.out.println("Input three side of triangle : ");
        double side1 = inputScanner.nextDouble();
        double side2 = inputScanner.nextDouble();
        double side3 = inputScanner.nextDouble();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(colorString);
            triangle.setFilled(filled);

            System.out.println(triangle.toString());
        } catch (IllegalTriangleException e) {
            
            System.out.println("error");
            System.out.println(e.getMessage());
        }

    }
}
