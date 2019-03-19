/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle;

import java.util.Scanner;

/**
 *
 * @author 61010707
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Triangle");
        Scanner input = new Scanner(System.in);
        System.out.print("input color : ");
        String color = input.nextLine();
        System.out.print("input isFill(true / false)  : ");
        boolean isFill = input.nextBoolean();
        System.out.print("Input side1 , side2 , side3 : ");
        double[] side = new double[3];
        side[0] = input.nextDouble();
        side[1] = input.nextDouble();
        side[2] = input.nextDouble();

        Triangle triangle = new Triangle(side[0], side[1], side[2]);
        triangle.setColor(color);
        triangle.setIsFill(isFill);

        System.out.println(triangle.toString());
        System.out.println("Get Area  : " + triangle.getArea());
        System.out.println("Get perimeter : " + triangle.getPerimeter());
        System.out.println("Get color : " + triangle.getColor());
        System.out.println("Get isFill : " + triangle.getIsFill());
    }
}
