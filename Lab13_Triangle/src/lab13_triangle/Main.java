/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_triangle;

import java.util.Scanner;

/**
 *
 * @author 61010707
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter 3 side : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter a color: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println(triangle.toString());
    }

}
