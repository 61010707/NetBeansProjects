/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

/**
 *
 * @author DrZin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Triangle triangle = new Triangle(12.0, 12.5, 15.3);
        triangle.setColor("white");
        triangle.setIsFilled(true);
        //--- getArea in two digit ---//
        System.out.println(String.format("%.2f", triangle.getArea()));
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());
    }

}
