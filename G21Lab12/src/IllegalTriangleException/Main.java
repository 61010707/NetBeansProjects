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

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);

        System.err.print("input color : ");
        String colorString = input.next();

        System.out.print("input isFilled(true / false) : ");
        boolean Filled = input.nextBoolean();

        System.out.print("input three side of triangle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle.toString());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }
}
